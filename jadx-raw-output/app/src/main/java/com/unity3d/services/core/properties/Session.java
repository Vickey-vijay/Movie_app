package com.unity3d.services.core.properties;

/* JADX INFO: compiled from: Session.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    /* JADX INFO: compiled from: Session.kt */
    public static final class Default implements Session {
        public static final /* synthetic */ Default $$INSTANCE = new Default();

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private static final String f45398id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        public String getId() {
            return f45398id;
        }
    }

    String getId();
}
