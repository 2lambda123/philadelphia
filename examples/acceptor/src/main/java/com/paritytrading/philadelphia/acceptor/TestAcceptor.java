/*
 * Copyright 2015 Philadelphia authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paritytrading.philadelphia.acceptor;

import java.io.IOException;
import java.net.InetSocketAddress;

class TestAcceptor {

    public static void main(String[] args) {
        if (args.length != 1)
            usage();

        try {
            main(Integer.parseInt(args[0]));
        } catch (NumberFormatException e) {
            usage();
        } catch (IOException e) {
            fatal(e);
        }
    }

    private static void main(int port) throws IOException {
        Acceptor acceptor = Acceptor.open(new InetSocketAddress(port));

        Session session = acceptor.accept();

        acceptor.close();

        int i = 0;

        while (true) {
            if (session.getConnection().receive() < 0)
                break;

            if (i % 1000 == 0) {
                session.getConnection().setCurrentTimeMillis(System.currentTimeMillis());
                session.getConnection().keepAlive();
            }

            i++;
        }

        session.getConnection().close();
    }

    private static void usage() {
        System.err.println("Usage: philadelphia-acceptor <port>");
        System.exit(2);
    }

    private static void fatal(Throwable throwable) {
        System.err.println("fatal: " + throwable.getMessage());
        System.err.println();
        throwable.printStackTrace(System.err);
        System.err.println();
        System.exit(1);
    }

}
