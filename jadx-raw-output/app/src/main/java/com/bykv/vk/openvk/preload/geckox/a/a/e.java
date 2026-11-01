package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FIFOCachePolicy.java */
/* JADX INFO: loaded from: classes8.dex */
final class e extends b {
    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.f10561e.iterator();
        while (it.hasNext()) {
            List<File> listB = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.f10560d, it.next()));
            if (listB != null && listB.size() > this.f10559c.f10551a) {
                for (File file : listB.subList(0, listB.size() - this.f10559c.f10551a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.f10559c.f10552b != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
