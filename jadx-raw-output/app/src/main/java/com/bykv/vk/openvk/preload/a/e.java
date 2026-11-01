package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: InterceptorFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public interface e {
    <T> T a(Class<T> cls);

    /* JADX INFO: compiled from: InterceptorFactory.java */
    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.a.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
