package com.yk.e.pl;

import com.yk.e.inf.IAdPlayer;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseAdPlayer implements IAdPlayer {
    public static String TAG = "Okt_AdPlayer";
    private IPlayerCallback callback;
    private IPlayerPreLoadCallback preLoadCallback;
    private IPreparedCallback preparedCallback;

    public interface IPlayerCallback {
        void onPlayComplete();

        void onPlayFailed(String str);

        void onStartPlay();
    }

    public interface IPlayerPreLoadCallback {
        void onPreLoadFailed(String str);

        void onStatReady();
    }

    public interface IPreparedCallback {
        void onPrepared();
    }

    public void onPlayComplete() {
        printMsg("onPlayComplete");
        IPlayerCallback iPlayerCallback = this.callback;
        if (iPlayerCallback != null) {
            iPlayerCallback.onPlayComplete();
        }
    }

    public void onPlayError(String str) {
        printMsg("onPlayError " + str);
    }

    public void onPlayFailed(String str) {
        printMsg("onPlayFailed " + str);
        IPlayerCallback iPlayerCallback = this.callback;
        if (iPlayerCallback != null) {
            iPlayerCallback.onPlayFailed(str);
        }
    }

    public void onPreLoadFailed(String str) {
        printMsg("onPreLoadFailed, msg = " + str);
        IPlayerPreLoadCallback iPlayerPreLoadCallback = this.preLoadCallback;
        if (iPlayerPreLoadCallback != null) {
            iPlayerPreLoadCallback.onPreLoadFailed(str);
        }
    }

    public void onPrepared() {
        printMsg("onPrepared");
        IPreparedCallback iPreparedCallback = this.preparedCallback;
        if (iPreparedCallback != null) {
            iPreparedCallback.onPrepared();
        }
    }

    public void onReady() {
        printMsg("onReady");
        IPlayerPreLoadCallback iPlayerPreLoadCallback = this.preLoadCallback;
        if (iPlayerPreLoadCallback != null) {
            iPlayerPreLoadCallback.onStatReady();
        }
    }

    public void onStartPlay() {
        printMsg("onStartPlay");
        IPlayerCallback iPlayerCallback = this.callback;
        if (iPlayerCallback != null) {
            iPlayerCallback.onStartPlay();
        }
    }

    public void printErrMsg(String str, Throwable th2) {
        AdLog.e(TAG, String.format("%s err, msg = %s", str, th2.getMessage()), th2);
    }

    public void printMsg(String str) {
        AdLog.i(TAG, str);
    }

    public void setIPlayerCallback(IPlayerCallback iPlayerCallback) {
        this.callback = iPlayerCallback;
    }

    public void setIPreLoadCallback(IPlayerPreLoadCallback iPlayerPreLoadCallback) {
        this.preLoadCallback = iPlayerPreLoadCallback;
    }

    public void setIPreparedCallback(IPreparedCallback iPreparedCallback) {
        this.preparedCallback = iPreparedCallback;
    }
}
