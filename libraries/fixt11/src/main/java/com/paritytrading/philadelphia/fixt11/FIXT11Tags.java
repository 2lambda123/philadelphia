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
 * Tags for FIXT 1.1.
 */
public class FIXT11Tags {

    public static final int BeginSeqNo                 = 7;
    public static final int BeginString                = 8;
    public static final int BodyLength                 = 9;
    public static final int CheckSum                   = 10;
    public static final int EndSeqNo                   = 16;
    public static final int MsgSeqNum                  = 34;
    public static final int MsgType                    = 35;
    public static final int NewSeqNo                   = 36;
    public static final int PossDupFlag                = 43;
    public static final int RefSeqNum                  = 45;
    public static final int SenderCompID               = 49;
    public static final int SenderSubID                = 50;
    public static final int SendingTime                = 52;
    public static final int TargetCompID               = 56;
    public static final int TargetSubID                = 57;
    public static final int Text                       = 58;
    public static final int Signature                  = 89;
    public static final int SecureDataLen              = 90;
    public static final int SecureData                 = 91;
    public static final int SignatureLength            = 93;
    public static final int RawDataLength              = 95;
    public static final int RawData                    = 96;
    public static final int PossResend                 = 97;
    public static final int EncryptMethod              = 98;
    public static final int HeartBtInt                 = 108;
    public static final int TestReqID                  = 112;
    public static final int OnBehalfOfCompID           = 115;
    public static final int OnBehalfOfSubID            = 116;
    public static final int OrigSendingTime            = 122;
    public static final int GapFillFlag                = 123;
    public static final int DeliverToCompID            = 128;
    public static final int DeliverToSubID             = 129;
    public static final int ResetSeqNumFlag            = 141;
    public static final int SenderLocationID           = 142;
    public static final int TargetLocationID           = 143;
    public static final int OnBehalfOfLocationID       = 144;
    public static final int DeliverToLocationID        = 145;
    public static final int XmlDataLen                 = 212;
    public static final int XmlData                    = 213;
    public static final int MessageEncoding            = 347;
    public static final int EncodedTextLen             = 354;
    public static final int EncodedText                = 355;
    public static final int LastMsgSeqNumProcessed     = 369;
    public static final int RefTagID                   = 371;
    public static final int RefMsgType                 = 372;
    public static final int SessionRejectReason        = 373;
    public static final int MaxMessageSize             = 383;
    public static final int NoMsgTypes                 = 384;
    public static final int MsgDirection               = 385;
    public static final int TestMessageIndicator       = 464;
    public static final int Username                   = 553;
    public static final int Password                   = 554;
    public static final int NoHops                     = 627;
    public static final int HopCompID                  = 628;
    public static final int HopSendingTime             = 629;
    public static final int HopRefID                   = 630;
    public static final int NextExpectedMsgSeqNum      = 789;
    public static final int NewPassword                = 925;
    public static final int ApplVerID                  = 1128;
    public static final int CstmApplVerID              = 1129;
    public static final int RefApplVerID               = 1130;
    public static final int RefCstmApplVerID           = 1131;
    public static final int DefaultApplVerID           = 1137;
    public static final int ApplExtID                  = 1156;
    public static final int EncryptedPasswordMethod    = 1400;
    public static final int EncryptedPasswordLen       = 1401;
    public static final int EncryptedPassword          = 1402;
    public static final int EncryptedNewPasswordLen    = 1403;
    public static final int EncryptedNewPassword       = 1404;
    public static final int RefApplExtID               = 1406;
    public static final int DefaultApplExtID           = 1407;
    public static final int DefaultCstmApplVerID       = 1408;
    public static final int SessionStatus              = 1409;
    public static final int DefaultVerIndicator        = 1410;
    public static final int FIXEngineName              = 1600;
    public static final int FIXEngineVersion           = 1601;
    public static final int FIXEngineVendor            = 1602;
    public static final int ApplicationSystemName      = 1603;
    public static final int ApplicationSystemVersion   = 1604;
    public static final int ApplicationSystemVendor    = 1605;
    public static final int ApplLevelRecoveryIndicator = 1744;
    public static final int NoAttachments              = 2104;
    public static final int AttachmentName             = 2105;
    public static final int AttachmentMediaType        = 2106;
    public static final int AttachmentClassification   = 2107;
    public static final int AttachmentExternalURL      = 2108;
    public static final int AttachmentEncodingType     = 2109;
    public static final int UnencodedAttachmentLen     = 2110;
    public static final int EncodedAttachmentLen       = 2111;
    public static final int EncodedAttachment          = 2112;
    public static final int NoAttachmentKeywords       = 2113;
    public static final int AttachmentKeyword          = 2114;

    private FIXT11Tags() {
    }

}
