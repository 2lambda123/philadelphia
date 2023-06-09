/*
 * Copyright 2022 Philadelphia authors
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
package com.paritytrading.philadelphia.fix41;

/*
 * This file has been automatically generated using Philadelphia Code
 * Generator. For more information on Philadelphia Code Generator, see:
 *
 *   https://github.com/paritytrading/philadelphia
 */

/**
 * Message types for FIX 4.1.
 */
public class FIX41MsgTypes {

    public static final char Heartbeat                 = '0';
    public static final char TestRequest               = '1';
    public static final char ResendRequest             = '2';
    public static final char Reject                    = '3';
    public static final char SequenceReset             = '4';
    public static final char Logout                    = '5';
    public static final char IOI                       = '6';
    public static final char Advertisement             = '7';
    public static final char ExecutionReport           = '8';
    public static final char OrderCancelReject         = '9';
    public static final char Logon                     = 'A';
    public static final char News                      = 'B';
    public static final char Email                     = 'C';
    public static final char OrderSingle               = 'D';
    public static final char OrderList                 = 'E';
    public static final char OrderCancelRequest        = 'F';
    public static final char OrderCancelReplaceRequest = 'G';
    public static final char OrderStatusRequest        = 'H';
    public static final char Allocation                = 'J';
    public static final char ListCancelRequest         = 'K';
    public static final char ListExecute               = 'L';
    public static final char ListStatusRequest         = 'M';
    public static final char ListStatus                = 'N';
    public static final char AllocationInstructionAck  = 'P';
    public static final char DontKnowTrade             = 'Q';
    public static final char QuoteRequest              = 'R';
    public static final char Quote                     = 'S';
    public static final char SettlementInstructions    = 'T';

    private FIX41MsgTypes() {
    }

}
