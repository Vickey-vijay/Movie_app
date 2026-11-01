package androidx.work.impl.constraints;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkState {
    private boolean mIsConnected;
    private boolean mIsMetered;
    private boolean mIsNotRoaming;
    private boolean mIsValidated;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.mIsConnected == networkState.mIsConnected && this.mIsValidated == networkState.mIsValidated && this.mIsMetered == networkState.mIsMetered && this.mIsNotRoaming == networkState.mIsNotRoaming;
    }

    @NonNull
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.mIsConnected), Boolean.valueOf(this.mIsValidated), Boolean.valueOf(this.mIsMetered), Boolean.valueOf(this.mIsNotRoaming));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r10 = this.mIsConnected;
        int i10 = r10;
        if (this.mIsValidated) {
            i10 = r10 + 16;
        }
        int i11 = i10;
        if (this.mIsMetered) {
            i11 = i10 + 256;
        }
        return this.mIsNotRoaming ? i11 + 4096 : i11;
    }

    public boolean isConnected() {
        return this.mIsConnected;
    }

    public boolean isMetered() {
        return this.mIsMetered;
    }

    public boolean isNotRoaming() {
        return this.mIsNotRoaming;
    }

    public boolean isValidated() {
        return this.mIsValidated;
    }

    public NetworkState(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.mIsConnected = z10;
        this.mIsValidated = z11;
        this.mIsMetered = z12;
        this.mIsNotRoaming = z13;
    }
}
