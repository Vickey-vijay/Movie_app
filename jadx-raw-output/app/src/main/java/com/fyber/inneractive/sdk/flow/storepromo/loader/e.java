package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15619b;

    public e(f fVar, d dVar) {
        this.f15619b = fVar;
        this.f15618a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        f fVar = this.f15619b;
        if (fVar.f15625f == null || (cVar = fVar.f15621b) == null) {
            return;
        }
        d dVar = this.f15618a;
        StringBuilder sb2 = new StringBuilder("\n<script>\n");
        ArrayList<com.fyber.inneractive.sdk.flow.storepromo.model.a> arrayList = cVar.f15668a;
        StringBuilder sb3 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        for (com.fyber.inneractive.sdk.flow.storepromo.model.a aVar : arrayList) {
            int i12 = h.f15635a[aVar.f15665a.ordinal()];
            if (i12 == 1) {
                i10++;
                String str = i.f15636a;
                String str2 = String.format("app_screen_%d", Integer.valueOf(i10));
                sb3.append("var " + str2 + "_el = document.createElement('img');\n" + str2 + "_el.id = '" + str2 + "';\ndocument.getElementById('carousel').appendChild(" + str2 + "_el);\n");
                sb3.append(String.format(i.f15636a, Integer.valueOf(i10), aVar.f15666b));
                sb3.append(String.format(i.f15637b, Integer.valueOf(i10), Integer.valueOf(i10)));
            } else if (i12 == 2) {
                i11++;
                String str3 = i.f15636a;
                String str4 = String.format("app_video_url_%d", Integer.valueOf(i11));
                sb3.append("var " + str4 + "_el = document.createElement('video');\n" + str4 + "_el.id = '" + str4 + "';\ndocument.getElementById('carousel').appendChild(" + str4 + "_el);\n");
                sb3.append(String.format(i.f15638c, Integer.valueOf(i11), aVar.f15666b));
                sb3.append(String.format(i.f15639d, Integer.valueOf(i11), Integer.valueOf(i11)));
            } else if (i12 == 3) {
                sb3.append(String.format(i.f15640e, aVar.f15666b));
                sb3.append(i.f15641f);
            } else if (i12 == 4) {
                sb3.append(String.format(i.f15652q, aVar.f15666b));
                sb3.append(i.f15653r);
            }
        }
        sb2.append(sb3.toString());
        sb2.append(String.format(i.f15642g, cVar.f15669b.replace("`", "\\`")) + i.f15643h + String.format(i.f15644i, cVar.f15673f.replace("`", "\\`")) + i.f15645j + String.format(i.f15646k, cVar.f15674g.f15678b.replace("`", "\\`")) + i.f15647l + String.format(i.f15650o, cVar.f15674g.f15677a.replace("`", "\\`")) + i.f15651p + String.format(i.f15648m, cVar.f15674g.f15679c.replace("`", "\\`")) + i.f15649n);
        StringBuilder sb4 = new StringBuilder();
        boolean z10 = Boolean.parseBoolean(cVar.f15671d);
        boolean z11 = Boolean.parseBoolean(cVar.f15672e);
        sb4.append(i.a(z10, "in_app_purchases"));
        sb4.append(i.a(z11, "app_contains_ads"));
        sb4.append(i.a(z11 && z10, "app_subtitle_separator"));
        sb2.append(sb4.toString());
        sb2.append("</script>");
        String str5 = cVar.f15670c + sb2.toString();
        dVar.getClass();
        r.f18607b.post(new c(dVar, str5));
    }
}
