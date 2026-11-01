package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.bidmachine.core.Logger;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
public class SessionManager {

    @NonNull
    public static final String SESSION_ID_EMPTY = "";

    @NonNull
    private static final String TAG = "SessionManager";

    @Nullable
    private static volatile SessionManager instance;

    @Nullable
    private volatile Context applicationContext;
    private long pauseTime;
    private long resumeTime;
    private long sessionDuration;
    private long sessionResetAfterSec;

    @NonNull
    private final EnumMap<AdsType, SessionAdParams> sessionAdParamsMap = new EnumMap<>(AdsType.class);

    @NonNull
    private String sessionId = "";

    @NonNull
    private final CopyOnWriteArraySet<a> observers = new CopyOnWriteArraySet<>();

    public enum Status {
        START,
        RESUME,
        PAUSE
    }

    public interface a {
        void onSessionEvent(@NonNull Status status);
    }

    public synchronized void attachContext(@NonNull Context context) {
        boolean z10 = this.applicationContext == null;
        this.applicationContext = context.getApplicationContext();
        if (z10) {
            onContextAttached();
        }
    }

    @NonNull
    public synchronized SessionAdParams getSessionAdParams(@NonNull AdsType adsType) {
        SessionAdParams sessionAdParams;
        sessionAdParams = this.sessionAdParamsMap.get(adsType);
        if (sessionAdParams == null) {
            sessionAdParams = new SessionAdParams();
            this.sessionAdParamsMap.put(adsType, sessionAdParams);
        }
        return sessionAdParams;
    }

    @NonNull
    public static SessionManager get() {
        SessionManager sessionManager = instance;
        if (sessionManager == null) {
            synchronized (SessionManager.class) {
                sessionManager = instance;
                if (sessionManager == null) {
                    sessionManager = new SessionManager();
                    instance = sessionManager;
                }
            }
        }
        return sessionManager;
    }

    private void incrementSessionCounter() {
        Utils.ifNotNull(this.applicationContext, new Executable() { // from class: io.bidmachine.e5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                SessionManager.lambda$incrementSessionCounter$1((Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$incrementSessionCounter$1(final Context context) {
        Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.d5
            @Override // java.lang.Runnable
            public final void run() {
                o2.incrementSessionCount(context);
            }
        });
    }

    private void notifyObservers(@NonNull Status status) {
        Iterator<a> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onSessionEvent(status);
        }
    }

    public void addObserver(@NonNull a aVar) {
        this.observers.add(aVar);
    }

    @WorkerThread
    public int getSessionCount() {
        Context context = this.applicationContext;
        if (context != null) {
            return o2.getSessionCount(context);
        }
        Logger.w(TAG, "Context not attached");
        return 0;
    }

    public int getSessionDuration() {
        if (this.resumeTime == 0) {
            return 0;
        }
        return (int) ((this.sessionDuration + (TimeManager.currentTimeMillis() - this.resumeTime)) / 1000);
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }

    public void pause() {
        if (this.resumeTime == 0) {
            return;
        }
        long jCurrentTimeMillis = TimeManager.currentTimeMillis();
        this.pauseTime = jCurrentTimeMillis;
        this.sessionDuration += jCurrentTimeMillis - this.resumeTime;
        notifyObservers(Status.PAUSE);
        Logger.d(TAG, "Session paused");
    }

    public void removeObserver(@NonNull a aVar) {
        this.observers.remove(aVar);
    }

    public void setSessionResetAfter(long j10) {
        this.sessionResetAfterSec = j10;
    }

    private SessionManager() {
        startNewSession();
    }

    private void onContextAttached() {
        incrementSessionCounter();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void resume() {
        long jCurrentTimeMillis = TimeManager.currentTimeMillis();
        long j10 = this.sessionResetAfterSec;
        if (j10 > 0) {
            long j11 = this.pauseTime;
            if (j11 > 0 && jCurrentTimeMillis - j11 >= j10 * 1000) {
                startNewSession();
            } else {
                notifyObservers(Status.RESUME);
                Logger.d(TAG, "Session resumed");
            }
        } else {
            notifyObservers(Status.RESUME);
            Logger.d(TAG, "Session resumed");
        }
        this.resumeTime = jCurrentTimeMillis;
    }

    @VisibleForTesting
    public void startNewSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.sessionDuration = 0L;
        this.pauseTime = 0L;
        this.resumeTime = 0L;
        for (AdsType adsType : AdsType.values()) {
            getSessionAdParams(adsType).clear();
        }
        notifyObservers(Status.START);
        incrementSessionCounter();
        Logger.d(TAG, "New session started");
    }
}
