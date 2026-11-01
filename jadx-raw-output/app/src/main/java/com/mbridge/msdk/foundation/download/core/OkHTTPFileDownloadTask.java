package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.toolbox.OKHTTPEventListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private b0 _responseBody;
    private p monitor;

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean z10 = !isSupportResume(i10, this._downloadModel);
        boolean z11 = (a0Var == null || this._downloadRequest == null || i10 != 206 || a0Var.d() == null || this._downloadRequest.getTotalBytes() <= 0 || a0Var.d().k() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) ? false : true;
        if (z10 && z11) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        b0 b0VarD = a0Var.d();
        this._responseBody = b0VarD;
        if (Objects.isNull(b0VarD)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long jK = this._responseBody.k();
        if (jK <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(jK);
        }
        InputStream inputStreamD = this._responseBody.d();
        this._inputStream = inputStreamD;
        if (Objects.isNull(inputStreamD)) {
            downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        this._downloadMessage.setContentLength(this._downloadRequest.getTotalBytes());
        this._downloadRequest.handlerResponseStartEvent(this._downloadMessage);
        return handleInputStream(str, str2, str3, this._etag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private DownloadResponse handleInputStream(String str, String str2, String str3, String str4) throws IllegalAccessException, IOException {
        String md5;
        MessageDigest messageDigest;
        String str5;
        Object[] objArr;
        byte[] bArr;
        boolean z10;
        String str6;
        DownloadResponse downloadResponse;
        String str7;
        String str8 = IDownloadTask.TAG;
        DownloadResponse downloadResponse2 = new DownloadResponse();
        boolean z11 = true;
        if (Objects.isNull(this._downloadModel)) {
            DownloadModel downloadModelCreate = DownloadModel.create(this._downloadRequest.getDownloadId(), this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), 0L, this._downloadMessage.getDownloadRate(), 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = downloadModelCreate;
            this._databaseHelper.insert(downloadModelCreate);
        } else {
            DownloadModel downloadModelCreate2 = DownloadModel.create(this._downloadModel.getDownloadId(), this._downloadModel.getDownloadUrl(), this._downloadMessage.getResourceUrl(), this._downloadModel.getEtag(), this._downloadModel.getSaveDirectorPath(), this._downloadModel.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadModel.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter() + 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = downloadModelCreate2;
            this._databaseHelper.update(downloadModelCreate2, str2);
        }
        DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(str2, str));
        this._outputStream = downloadFileOutputStream;
        downloadFileOutputStream.seek(this._downloadRequest.getDownloadedBytes());
        MessageDigest messageDigest2 = null;
        try {
            if (this._downloadMessage == null || !this._downloadMessage.isCheckMD5() || TextUtils.isEmpty(this._downloadMessage.getMd5())) {
                messageDigest = null;
                objArr = false;
                str5 = "";
            } else {
                md5 = this._downloadMessage.getMd5();
                try {
                    messageDigest2 = MessageDigest.getInstance(SameMD5.TAG);
                    if (this._downloadMessage.getDownloadRate() != 100 || TextUtils.isEmpty(md5)) {
                        messageDigest = messageDigest2;
                        str5 = md5;
                        objArr = false;
                    } else {
                        messageDigest = messageDigest2;
                        str5 = md5;
                        objArr = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, th.getMessage());
                }
            }
            while (true) {
                int i10 = this._inputStream.read(bArr);
                if (i10 == -1) {
                    z10 = z11;
                    str6 = str8;
                    downloadResponse = downloadResponse2;
                    break;
                }
                this._outputStream.write(bArr, 0, i10);
                DownloadRequest downloadRequest = this._downloadRequest;
                downloadRequest.setDownloadedBytes(downloadRequest.getDownloadedBytes() + ((long) i10));
                if (objArr != false && messageDigest != null) {
                    try {
                        messageDigest.update(bArr, 0, i10);
                    } catch (Exception unused) {
                    }
                }
                this._outputStream.flushAndSync();
                int downloadRate = Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes());
                z10 = true;
                str6 = str8;
                DownloadResponse downloadResponse3 = downloadResponse2;
                sendProgress(this._downloadRequest, this._downloadMessage, this._downloadRequest.getDownloadedBytes(), this._downloadRequest.getTotalBytes(), downloadRate);
                p pVar = this.monitor;
                if (pVar != null) {
                    pVar.c(this._downloadRequest.getDownloadedBytes());
                }
                if (this._downloadMessage.getDownloadRate() != 100 && downloadRate >= this._downloadMessage.getDownloadRate()) {
                    downloadResponse = downloadResponse3;
                    break;
                }
                if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                    downloadResponse = downloadResponse3;
                    downloadResponse.setCancelled(true);
                    break;
                }
                z11 = true;
                downloadResponse2 = downloadResponse3;
                str8 = str6;
            }
        } catch (Throwable th3) {
            th = th3;
            md5 = "";
        }
        p pVar2 = this.monitor;
        if (pVar2 != null) {
            pVar2.d("process_data_start");
        }
        bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
        p pVar3 = this.monitor;
        if (pVar3 != null) {
            pVar3.d("process_data_end");
        }
        boolean z12 = z10;
        String str9 = str5;
        GlobalComponent.getInstance().getDatabaseHelper().updateProgress(str3, str2, DownloadModel.create(str3, this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter(), this._downloadMessage.getDownloadResourceType()));
        if (objArr != false) {
            try {
                if (this._downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
                    p pVar4 = this.monitor;
                    if (pVar4 != null) {
                        pVar4.d("validate_data_start");
                    }
                    String strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                    String lowerCase = TextUtils.isEmpty(str9) ? "" : str9.toLowerCase(Locale.US);
                    str7 = str6;
                    try {
                        GlobalComponent.getInstance().getLogger().log(str7, strHexEncode + Z7.f27998r + lowerCase);
                        p pVar5 = this.monitor;
                        if (pVar5 != null) {
                            pVar5.d("validate_data_end");
                        }
                        if (!TextUtils.isEmpty(strHexEncode) && !strHexEncode.equals(lowerCase)) {
                            this._downloadMessage.setMd5VerifyResult(z12 ? 1 : 0);
                            downloadResponse.setFailed(z12);
                            downloadResponse.setError(new DownloadError(new Exception("File MD5 check fail.")));
                            return downloadResponse;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        GlobalComponent.getInstance().getLogger().log(str7, th.getMessage());
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str7 = str6;
            }
        }
        if (!downloadResponse.isCancelled()) {
            downloadResponse.setSuccessful(z12);
        }
        return downloadResponse;
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e10) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e10.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private boolean isSupportResume(int i10, DownloadModel downloadModel) {
        return i10 == 206 && !TextUtils.isEmpty(this._etag) && (downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag()));
    }

    private void reportDownloadMessage() {
        boolean zIsSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add("su", Boolean.toString(zIsSuccessful));
        boolean zIsCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(zIsCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!zIsSuccessful && !zIsCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        p pVar = this.monitor;
        if (pVar != null) {
            if (zIsSuccessful) {
                pVar.a(1);
            } else {
                String errorMessage = this._downloadResponse.getErrorMessage();
                DownloadError error = this._downloadResponse.getError();
                Exception exception = error == null ? null : error.getException();
                p pVar2 = this.monitor;
                if (zIsCancelled) {
                    exception = new IOException("download request canceled");
                }
                pVar2.a(exception);
                if (TextUtils.equals(errorMessage, "timeout")) {
                    this.monitor.a(3);
                } else {
                    this.monitor.a(2);
                }
            }
        }
        this._downloaderReporter.build().report();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x02a0  */
    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() throws Throwable {
        this._downloadResponse = new DownloadResponse();
        if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
            this._downloadResponse.setCancelled(true);
            return this._downloadResponse;
        }
        long totalBytes = this._downloadRequest.getTotalBytes();
        long downloadedBytes = this._downloadRequest.getDownloadedBytes();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_CURRENT_RATE, String.valueOf(Utils.getDownloadRate(totalBytes, downloadedBytes)));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, String.valueOf(downloadedBytes));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_TOTAL_BYTES, String.valueOf(totalBytes));
        if (totalBytes != 0 && downloadedBytes != 0 && totalBytes == downloadedBytes) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR_VALUE);
            this._downloaderReporter.build().report();
            this._downloadResponse.setSuccessful(true);
            return this._downloadResponse;
        }
        String saveFileName = this._downloadMessage.getSaveFileName();
        String cacheDirectoryPath = this._downloadRequest.getCacheDirectoryPath();
        String downloadId = this._downloadRequest.getDownloadId();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        p monitor = this._downloadRequest.getMonitor();
        this.monitor = monitor;
        if (monitor == null && this._downloadRequest.canTrack() && !TextUtils.isEmpty(downloadUrl)) {
            p pVar = new p(d.a((DownloadRequest<?>) this._downloadRequest), "GET");
            this.monitor = pVar;
            pVar.f(downloadUrl);
            this._downloadRequest.setMonitor(this.monitor);
        }
        long timeout = this._downloadRequest.getTimeout();
        long connectTimeout = this._downloadRequest.getConnectTimeout();
        long readTimeout = this._downloadRequest.getReadTimeout();
        long writeTimeout = this._downloadRequest.getWriteTimeout();
        long requestQueueTime = this._downloadRequest.getRequestQueueTime();
        p pVar2 = this.monitor;
        if (pVar2 != null) {
            pVar2.i(timeout);
            this.monitor.e(connectTimeout);
            this.monitor.f(readTimeout);
            this.monitor.j(writeTimeout);
            this.monitor.d("queue");
            this.monitor.a(requestQueueTime);
        }
        String str = String.format(Locale.ENGLISH, FORMAT_RANGE, Long.valueOf(downloadedBytes));
        try {
            v.b bVarS = GlobalComponent.getInstance().getOkHttpClient().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v vVarA = bVarS.b(connectTimeout, timeUnit).a(new MBridgeHostnameVerifier(downloadUrl)).d(readTimeout, timeUnit).e(writeTimeout, timeUnit).a(Math.max(0L, timeout), timeUnit).a(new OKHTTPEventListener(this.monitor)).b(true).a();
            y yVarA = new y.a().b(downloadUrl).a(new c.a().b().a()).a(CONNECTION, "close").a(Command.HTTP_HEADER_RANGE, str).a("User-Agent").a("User-Agent", Command.DEFAULT_USER_AGENT).a();
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, yVarA.g().g());
            this._downloaderReporter.add("url", downloadUrl);
            com.mbridge.msdk.thrid.okhttp.d dVarA = vVarA.a(yVarA);
            a0 a0Var = null;
            try {
                try {
                    a0 a0VarD = dVarA.d();
                    try {
                        if (!Objects.isNull(a0VarD) && !Objects.isNull(a0VarD.d())) {
                            int iK = a0VarD.k();
                            p pVar3 = this.monitor;
                            if (pVar3 != null) {
                                pVar3.b(iK);
                            }
                            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(iK));
                            if (a0VarD.n()) {
                                this._etag = a0VarD.a(Command.HTTP_HEADER_ETAG, "");
                                this._downloadResponse = handlerRequestSuccessful(saveFileName, cacheDirectoryPath, downloadId, a0VarD, iK);
                                Objects.closeInputStream(this._inputStream);
                                Objects.closeOutputStream(this._outputStream);
                                Objects.closeResponse(a0VarD);
                                Objects.closeResponseBody(this._responseBody);
                                if (!dVarA.h()) {
                                    dVarA.cancel();
                                }
                                reportDownloadMessage();
                                return this._downloadResponse;
                            }
                            this._downloadResponse.setError(new IOException(RESPONSE_CODE + iK));
                            DownloadResponse downloadResponse = this._downloadResponse;
                            Objects.closeInputStream(this._inputStream);
                            Objects.closeOutputStream(this._outputStream);
                            Objects.closeResponse(a0VarD);
                            Objects.closeResponseBody(this._responseBody);
                            if (!dVarA.h()) {
                                dVarA.cancel();
                            }
                            reportDownloadMessage();
                            return downloadResponse;
                        }
                        this._downloadResponse.setError(new IOException(RESPONSE_IS_NULL));
                        DownloadResponse downloadResponse2 = this._downloadResponse;
                        Objects.closeInputStream(this._inputStream);
                        Objects.closeOutputStream(this._outputStream);
                        Objects.closeResponse(a0VarD);
                        Objects.closeResponseBody(this._responseBody);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                        reportDownloadMessage();
                        return downloadResponse2;
                    } catch (Exception e10) {
                        e = e10;
                        a0Var = a0VarD;
                        handlerException(saveFileName, cacheDirectoryPath, downloadId, e);
                        Objects.closeInputStream(this._inputStream);
                        Objects.closeOutputStream(this._outputStream);
                        Objects.closeResponse(a0Var);
                        Objects.closeResponseBody(this._responseBody);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a0Var = a0VarD;
                        Objects.closeInputStream(this._inputStream);
                        Objects.closeOutputStream(this._outputStream);
                        Objects.closeResponse(a0Var);
                        Objects.closeResponseBody(this._responseBody);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                        reportDownloadMessage();
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            handlerException(saveFileName, cacheDirectoryPath, downloadId, e12);
            this._downloadResponse.setSuccessful(false);
            return this._downloadResponse;
        }
    }

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j10, long j11, int i10) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            if (downloadMessage != null) {
                downloadMessage.setCurrentDownloadRate(i10);
                downloadMessage.setContentLength(j11);
            }
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j10, j11, i10));
        }
    }
}
