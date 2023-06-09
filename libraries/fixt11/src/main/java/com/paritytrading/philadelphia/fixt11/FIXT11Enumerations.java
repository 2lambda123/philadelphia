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
package com.paritytrading.philadelphia.fixt11;

/*
 * This file has been automatically generated using Philadelphia Code
 * Generator. For more information on Philadelphia Code Generator, see:
 *
 *   https://github.com/paritytrading/philadelphia
 */

/**
 * Enumerations for FIXT 1.1.
 */
public class FIXT11Enumerations {

    /**
     * Values for EncryptMethod(98).
     */
    public static class EncryptMethodValues {

        public static final int None      = 0;
        public static final int PKCS      = 1;
        public static final int DES       = 2;
        public static final int PKCSDES   = 3;
        public static final int PGPDES    = 4;
        public static final int PGPDESMD5 = 5;
        public static final int PEM       = 6;

        private EncryptMethodValues() {
        }

    }

    /**
     * Values for SessionRejectReason(373).
     */
    public static class SessionRejectReasonValues {

        public static final int InvalidTagNumber                          = 0;
        public static final int RequiredTagMissing                        = 1;
        public static final int TagNotDefinedForThisMessageType           = 2;
        public static final int UndefinedTag                              = 3;
        public static final int TagSpecifiedWithoutAValue                 = 4;
        public static final int ValueIsIncorrect                          = 5;
        public static final int IncorrectDataFormatForValue               = 6;
        public static final int DecryptionProblem                         = 7;
        public static final int SignatureProblem                          = 8;
        public static final int CompIDProblem                             = 9;
        public static final int SendingTimeAccuracyProblem                = 10;
        public static final int InvalidMsgType                            = 11;
        public static final int XMLValidationError                        = 12;
        public static final int TagAppearsMoreThanOnce                    = 13;
        public static final int TagSpecifiedOutOfRequiredOrder            = 14;
        public static final int RepeatingGroupFieldsOutOfOrder            = 15;
        public static final int IncorrectNumInGroupCountForRepeatingGroup = 16;
        public static final int FieldDelimiterInFieldValue                = 17;
        public static final int InvalidUnsupportedAppVersion              = 18;
        public static final int Other                                     = 99;

        private SessionRejectReasonValues() {
        }

    }

    /**
     * Values for MsgDirection(385).
     */
    public static class MsgDirectionValues {

        public static final char Receive = 'R';
        public static final char Send    = 'S';

        private MsgDirectionValues() {
        }

    }

    /**
     * Values for ApplVerID(1128).
     *
     * <p>The following fields also use these values:</p>
     * <ul>
     *   <li>RefApplVerID(1130)</li>
     *   <li>DefaultApplVerID(1137)</li>
     * </ul>
     */
    public static class ApplVerIDValues {

        public static final String FIX27     = "0";
        public static final String FIX30     = "1";
        public static final String FIX40     = "2";
        public static final String FIX41     = "3";
        public static final String FIX42     = "4";
        public static final String FIX43     = "5";
        public static final String FIX44     = "6";
        public static final String FIX50     = "7";
        public static final String FIX50SP1  = "8";
        public static final String FIX50SP2  = "9";
        public static final String FIXLatest = "10";

        private ApplVerIDValues() {
        }

    }

    /**
     * Values for SessionStatus(1409).
     */
    public static class SessionStatusValues {

        public static final int SessionActive                             = 0;
        public static final int SessionPasswordChanged                    = 1;
        public static final int SessionPasswordDueToExpire                = 2;
        public static final int NewSessionPasswordDoesNotComplyWithPolicy = 3;
        public static final int SessionLogoutComplete                     = 4;
        public static final int InvalidUsernameOrPassword                 = 5;
        public static final int AccountLocked                             = 6;
        public static final int LogonsAreNotAllowedAtThisTime             = 7;
        public static final int PasswordExpired                           = 8;
        public static final int ReceivedMsgSeqNumTooLow                   = 9;
        public static final int ReceivedNextExpectedMsgSeqNumTooHigh      = 10;

        private SessionStatusValues() {
        }

    }

    /**
     * Values for ApplLevelRecoveryIndicator(1744).
     */
    public static class ApplLevelRecoveryIndicatorValues {

        public static final int NoApplRecoveryNeeded = 0;
        public static final int ApplRecoveryNeeded   = 1;

        private ApplLevelRecoveryIndicatorValues() {
        }

    }

    /**
     * Values for AttachmentEncodingType(2109).
     */
    public static class AttachmentEncodingTypeValues {

        public static final int Base64    = 0;
        public static final int RawBinary = 1;

        private AttachmentEncodingTypeValues() {
        }

    }

    private FIXT11Enumerations() {
    }

}
