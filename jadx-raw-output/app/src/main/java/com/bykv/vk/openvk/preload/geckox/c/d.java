package com.bykv.vk.openvk.preload.geckox.c;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LoadLocalChannelVersionInterceptor.java */
/* JADX INFO: loaded from: classes7.dex */
public class d extends com.bykv.vk.openvk.preload.a.d<List<String>, List<Pair<String, Long>>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f10642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10643e;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<List<Pair<String, Long>>> bVar, List<String> list) throws Throwable {
        List<String> list2 = list;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f10642d, this.f10643e);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long lA = com.bykv.vk.openvk.preload.geckox.utils.g.a(new File(file, str));
            arrayList.add(new Pair<>(str, Long.valueOf(lA == null ? 0L : lA.longValue())));
        }
        return bVar.a(arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f10642d = (File) objArr[0];
        this.f10643e = (String) objArr[1];
    }
}
