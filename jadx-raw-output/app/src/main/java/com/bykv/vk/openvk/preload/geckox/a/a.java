package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.ironsource.Q6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AbandonChannelClenUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f10542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10543b = 1;

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        Iterator<Map.Entry<String, ComponentModel.b>> it;
        Iterator<ComponentModel.a> it2;
        List<Long> listB;
        File file2;
        List<Long> listB2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<String, ComponentModel.b>> it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry<String, ComponentModel.b> next = it3.next();
                String key = next.getKey();
                File file3 = new File(file, key);
                if (file3.isDirectory() && (value = next.getValue()) != null && (list = value.f10681a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f10681a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        ComponentModel.a next2 = it4.next();
                        String str = next2.f10678a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i10 = next2.f10679b;
                            List<Long> list3 = next2.f10680c;
                            File file4 = new File(file3, str);
                            String str2 = "--pending-delete";
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        File file5 = new File(file3, str);
                                        File file6 = new File(file3, str + "--pending-delete");
                                        file5.renameTo(file6);
                                        arrayList2.add(new C0063a(key, str, i10, 0L, file6));
                                    }
                                } else if (list3 != null && (listB2 = g.b(file4)) != null && !listB2.isEmpty()) {
                                    for (Long l10 : listB2) {
                                        if (list3.get(0).longValue() > l10.longValue()) {
                                            File file7 = new File(file4, l10 + str2);
                                            new File(file4, String.valueOf(l10)).renameTo(file7);
                                            arrayList2.add(new C0063a(key, str, i10, l10.longValue(), file7));
                                        }
                                        str2 = str2;
                                        list3 = list3;
                                        i10 = i10;
                                        it4 = it4;
                                        file4 = file4;
                                        it3 = it3;
                                    }
                                }
                                it = it3;
                                it2 = it4;
                            } else {
                                it = it3;
                                it2 = it4;
                                File file8 = file4;
                                if (list3 != null && (listB = g.b(file8)) != null && !listB.isEmpty()) {
                                    Iterator<Long> it5 = listB.iterator();
                                    while (it5.hasNext()) {
                                        Long next3 = it5.next();
                                        if (list3.contains(next3)) {
                                            File file9 = file8;
                                            File file10 = new File(file9, next3 + "--pending-delete");
                                            new File(file9, String.valueOf(next3)).renameTo(file10);
                                            file2 = file9;
                                            arrayList2.add(new C0063a(key, str, i10, next3.longValue(), file10));
                                        } else {
                                            file2 = file8;
                                        }
                                        it5 = it5;
                                        file8 = file2;
                                    }
                                }
                            }
                            it3 = it;
                            it4 = it2;
                        }
                    }
                }
            }
            arrayList = arrayList2;
        } catch (Exception e10) {
            e10.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0063a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0063a c0063a : list4) {
                            File file11 = c0063a.f10550e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file11);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0063a.f10546a, c0063a.f10547b, c0063a.f10548c, 200, c0063a.f10549d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0063a.f10546a, c0063a.f10547b, c0063a.f10548c, 201, c0063a.f10549d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e11) {
                    GeckoLogger.w("clean-channel", "", e11);
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbandonChannelClenUtils.java */
    public static class C0063a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f10549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public File f10550e;

        public C0063a(String str, String str2, int i10, long j10, File file) {
            this.f10546a = str;
            this.f10547b = str2;
            this.f10548c = i10;
            this.f10549d = j10;
            this.f10550e = file;
        }
    }

    public a(List<String> list) {
        this.f10542a = list;
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f10542a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f10542a.size(); i10++) {
                    jSONArray.put(this.f10542a.get(i10));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put(Q6.F, 0);
            jSONObject.put("msg_type", this.f10543b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
