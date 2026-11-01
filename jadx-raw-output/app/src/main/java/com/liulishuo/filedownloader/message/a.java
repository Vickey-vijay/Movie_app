package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import p7.b;
import w7.d;
import w7.f;

/* JADX INFO: compiled from: MessageSnapshotTaker.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static MessageSnapshot a(int i10, File file, boolean z10) {
        long length = file.length();
        if (length > 2147483647L) {
            if (z10) {
                return new LargeMessageSnapshot.CompletedFlowDirectlySnapshot(i10, true, length);
            }
            return new LargeMessageSnapshot.CompletedSnapshot(i10, true, length);
        }
        if (z10) {
            return new SmallMessageSnapshot.CompletedFlowDirectlySnapshot(i10, true, (int) length);
        }
        return new SmallMessageSnapshot.CompletedSnapshot(i10, true, (int) length);
    }

    public static MessageSnapshot b(int i10, long j10, Throwable th2) {
        if (j10 > 2147483647L) {
            return new LargeMessageSnapshot.ErrorMessageSnapshot(i10, j10, th2);
        }
        return new SmallMessageSnapshot.ErrorMessageSnapshot(i10, (int) j10, th2);
    }

    public static MessageSnapshot c(int i10, long j10, long j11, boolean z10) {
        if (j11 > 2147483647L) {
            if (z10) {
                return new LargeMessageSnapshot.WarnFlowDirectlySnapshot(i10, j10, j11);
            }
            return new LargeMessageSnapshot.WarnMessageSnapshot(i10, j10, j11);
        }
        if (z10) {
            return new SmallMessageSnapshot.WarnFlowDirectlySnapshot(i10, (int) j10, (int) j11);
        }
        return new SmallMessageSnapshot.WarnMessageSnapshot(i10, (int) j10, (int) j11);
    }

    public static MessageSnapshot d(byte b10, FileDownloadModel fileDownloadModel, b.a aVar) {
        MessageSnapshot errorMessageSnapshot;
        String strF;
        IllegalStateException illegalStateException;
        int iG = fileDownloadModel.g();
        if (b10 != -4) {
            if (b10 != -3) {
                if (b10 != -1) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 5) {
                                    if (b10 != 6) {
                                        String strO = f.o("it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b10));
                                        d.i(a.class, "it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b10));
                                        if (aVar.a() != null) {
                                            illegalStateException = new IllegalStateException(strO, aVar.a());
                                        } else {
                                            illegalStateException = new IllegalStateException(strO);
                                        }
                                        if (fileDownloadModel.q()) {
                                            return new LargeMessageSnapshot.ErrorMessageSnapshot(iG, fileDownloadModel.i(), illegalStateException);
                                        }
                                        return new SmallMessageSnapshot.ErrorMessageSnapshot(iG, (int) fileDownloadModel.i(), illegalStateException);
                                    }
                                    return new MessageSnapshot.StartedMessageSnapshot(iG);
                                }
                                if (fileDownloadModel.q()) {
                                    errorMessageSnapshot = new LargeMessageSnapshot.RetryMessageSnapshot(iG, fileDownloadModel.i(), aVar.a(), aVar.b());
                                } else {
                                    errorMessageSnapshot = new SmallMessageSnapshot.RetryMessageSnapshot(iG, (int) fileDownloadModel.i(), aVar.a(), aVar.b());
                                }
                            } else {
                                if (fileDownloadModel.q()) {
                                    return new LargeMessageSnapshot.ProgressMessageSnapshot(iG, fileDownloadModel.i());
                                }
                                return new SmallMessageSnapshot.ProgressMessageSnapshot(iG, (int) fileDownloadModel.i());
                            }
                        } else {
                            if (fileDownloadModel.r()) {
                                strF = fileDownloadModel.f();
                            } else {
                                strF = null;
                            }
                            if (fileDownloadModel.q()) {
                                return new LargeMessageSnapshot.ConnectedMessageSnapshot(iG, aVar.c(), fileDownloadModel.m(), fileDownloadModel.d(), strF);
                            }
                            return new SmallMessageSnapshot.ConnectedMessageSnapshot(iG, aVar.c(), (int) fileDownloadModel.m(), fileDownloadModel.d(), strF);
                        }
                    } else {
                        if (fileDownloadModel.q()) {
                            return new LargeMessageSnapshot.PendingMessageSnapshot(iG, fileDownloadModel.i(), fileDownloadModel.m());
                        }
                        return new SmallMessageSnapshot.PendingMessageSnapshot(iG, (int) fileDownloadModel.i(), (int) fileDownloadModel.m());
                    }
                } else if (fileDownloadModel.q()) {
                    errorMessageSnapshot = new LargeMessageSnapshot.ErrorMessageSnapshot(iG, fileDownloadModel.i(), aVar.a());
                } else {
                    errorMessageSnapshot = new SmallMessageSnapshot.ErrorMessageSnapshot(iG, (int) fileDownloadModel.i(), aVar.a());
                }
                return errorMessageSnapshot;
            }
            if (fileDownloadModel.q()) {
                return new LargeMessageSnapshot.CompletedSnapshot(iG, false, fileDownloadModel.m());
            }
            return new SmallMessageSnapshot.CompletedSnapshot(iG, false, (int) fileDownloadModel.m());
        }
        throw new IllegalStateException(f.o("please use #catchWarn instead %d", Integer.valueOf(iG)));
    }

    public static MessageSnapshot e(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.getStatus() == -3) {
            return new BlockCompleteMessage.BlockCompleteMessageImpl(messageSnapshot);
        }
        throw new IllegalStateException(f.o("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus())));
    }
}
