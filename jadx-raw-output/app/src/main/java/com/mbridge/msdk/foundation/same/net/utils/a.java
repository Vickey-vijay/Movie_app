package com.mbridge.msdk.foundation.same.net.utils;

/* JADX INFO: compiled from: CommonHttpConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static String a(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        String str;
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i10 = aVar.f34991a;
            com.mbridge.msdk.foundation.same.net.toolbox.a aVar2 = aVar.f34993c;
            int i11 = aVar2 != null ? aVar2.f35014d : 0;
            if (i10 == -2) {
                str = "Network is canceled";
            } else if (i10 == 15) {
                str = "Network error,I/O exception contents null";
            } else if (i10 == 880023) {
                str = "timeout";
            } else if (i10 != 880041) {
                switch (i10) {
                    case 1:
                        return "Network error,Load failed";
                    case 2:
                        str = "Network error,I/O exception";
                        break;
                    case 3:
                        str = "Network error,timeout exception";
                        break;
                    case 4:
                        str = "Network unknown error";
                        break;
                    case 5:
                        str = "Network error，https is not work,please check your phone time";
                        break;
                    case 6:
                        str = i11 == 0 ? "Network error,please check " : "Network error,please check state code " + i11;
                        break;
                    case 7:
                        str = i11 == 0 ? "The server returns an exception " : "The server returns an exception state code " + i11;
                        break;
                    case 8:
                        str = "Cast exception, return data can not be casted correctly";
                        break;
                    default:
                        switch (i10) {
                            case 10:
                                str = "Network error,socket timeout exception";
                                break;
                            case 11:
                                str = "Network error，sslp exception";
                                break;
                            case 12:
                                str = "Network error,ConnectException";
                                break;
                            case 13:
                                if (aVar2 != null) {
                                    byte[] bArr = aVar2.f35011a;
                                    return bArr != null ? new String(bArr) : "Socket exception message is NULL";
                                }
                                str = "Unknown socket exception";
                                break;
                            default:
                                str = "Network error,unknown";
                                break;
                        }
                        break;
                }
            } else {
                str = "Network error,UnknownHostException";
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
