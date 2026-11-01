package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SubBranchInterceptor.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, a> f10523d;

    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<h> f10524a = new ArrayList();

        public final a a(h hVar) {
            this.f10524a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f10524a.addAll(list);
            return this;
        }
    }

    public final Map<String, a> a() {
        return this.f10523d;
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f10511a == f.class;
    }

    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, a> f10525a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f10526b;

        public final a a(String str) {
            if (this.f10525a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f10525a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f10525a).a(this.f10526b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f10523d = (Map) obj;
                return;
            } catch (ClassCastException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        throw new IllegalStateException("args error");
    }
}
