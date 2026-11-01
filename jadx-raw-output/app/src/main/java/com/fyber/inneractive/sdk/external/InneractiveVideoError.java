package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveVideoError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Error f15309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f15310b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }

        Error(String str, boolean z10) {
            this.errorString = str;
            this.isFatal = z10;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f15309a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f15310b == null) {
            return this.f15309a.getErrorString();
        }
        return this.f15309a.getErrorString() + ": " + this.f15310b;
    }

    public Throwable getCause() {
        return this.f15310b;
    }

    public Error getPlayerError() {
        return this.f15309a;
    }

    public InneractiveVideoError(Error error, Throwable th2) {
        this(error);
        this.f15310b = th2;
    }
}
