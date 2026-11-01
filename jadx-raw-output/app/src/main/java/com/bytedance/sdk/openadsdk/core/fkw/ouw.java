package com.bytedance.sdk.openadsdk.core.fkw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.fkw;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.lh.lh;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.vt;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw {
    private final List<String> vt = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final lh f12683lh = new lh();
    public final ConcurrentHashMap<String, Long> ouw = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fkw.ouw$ouw, reason: collision with other inner class name */
    public static class C0123ouw {
        private static final ouw ouw = new ouw();
    }

    private static File vt(String str) {
        String str2;
        String strOuw = fkw.ouw(str);
        if (strOuw == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (vt.lh()) {
            str2 = name + "/music/";
        } else {
            str2 = name + "//music/";
        }
        ko.ouw("MusicCacheManager", "cachePath is:", str2, ", musicCacheName is:", strOuw);
        return ra.ouw(zih.ouw(), vt.lh(), str2, strOuw);
    }

    public static ouw ouw() {
        return C0123ouw.ouw;
    }

    public static InputStream ouw(String str) {
        File fileVt = vt(str);
        if (fileVt != null && ouw(fileVt)) {
            try {
                return new FileInputStream(fileVt);
            } catch (Exception e10) {
                qbp.lh("MusicCacheManager", e10.getMessage());
            }
        }
        return null;
    }

    private static boolean ouw(File file) {
        return file.exists() && file.length() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final int i10, final long j10, final int i11, final String str) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("music_preload_finish", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.fkw.ouw.3
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i10);
                long j11 = j10;
                if (j11 != -1) {
                    jSONObject.put("load_duration", j11);
                }
                yu yuVar = new yu();
                yuVar.ouw = "music_preload_finish";
                yuVar.bly = jSONObject.toString();
                if (!TextUtils.isEmpty(str)) {
                    yuVar.f13321le = i11;
                    yuVar.f13323ra = str;
                }
                ko.ouw("MusicCacheManager", "report music_preload_finish", yuVar.ouw());
                return yuVar;
            }
        });
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        vpp.ouw ouwVar2;
        List<vpp> list = ouwVar.yu;
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            vpp vppVar = list.get(i10);
            if (vppVar != null && (ouwVar2 = vppVar.f12886xn) != null) {
                String str = ouwVar2.f12892ra;
                if (str != null && str.contains("music_url")) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw("music_preload_start", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.fkw.ouw.2
                        @Override // com.bytedance.sdk.openadsdk.rn.vt
                        public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                            yu yuVar = new yu();
                            yuVar.ouw = "music_preload_start";
                            ko.ouw("MusicCacheManager", "report music_preload_start", yuVar.ouw());
                            return yuVar;
                        }
                    });
                    String str2 = ouwVar2.bly;
                    if (TextUtils.isEmpty(str2)) {
                        try {
                            new JSONObject().put("result", 0);
                        } catch (JSONException e10) {
                            qbp.lh("MusicCacheManager", e10.getMessage());
                        }
                        ouw(0, -1L, 10001, "music url string is null");
                    } else {
                        File fileVt = vt(str2);
                        if (fileVt != null) {
                            ko.ouw("MusicCacheManager", "music cache file is:", fileVt.getPath());
                            if (ouw(fileVt)) {
                                ko.ouw("MusicCacheManager", "has music cache:", Boolean.TRUE);
                                ouw(2, -1L, -1, null);
                            } else {
                                ko.ouw("MusicCacheManager", "has music cache:", Boolean.FALSE);
                                if (!this.vt.contains(str2)) {
                                    this.ouw.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
                                    com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
                                    ouwVarLh.ouw(str2);
                                    ouwVarLh.ouw(fileVt.getParent(), fileVt.getName());
                                    ouwVarLh.vt(str2);
                                    this.vt.add(str2);
                                    ouwVarLh.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.fkw.ouw.1
                                        @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                        public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                                            ko.vt("MusicCacheManager", "download music fail");
                                            Long l10 = ouw.this.ouw.get(lhVar.yu());
                                            if (l10 != null) {
                                                ouw.this.ouw(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                                            }
                                        }

                                        @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                        public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                                            File file;
                                            ko.ouw("intercept_music", "get response header:", vtVar.f11908lh);
                                            ko.ouw("MusicCacheManager", "download music response, response is:", Integer.valueOf(vtVar.ouw));
                                            String strYu = lhVar.yu();
                                            Long l10 = ouw.this.ouw.get(strYu);
                                            if (vtVar.pno && (file = vtVar.f11909ra) != null && file.exists()) {
                                                ko.ouw("MusicCacheManager", "download music success, ", "file is:", vtVar.f11909ra);
                                                if (l10 != null) {
                                                    ouw.this.ouw.remove(strYu);
                                                    ouw.this.ouw(1, SystemClock.elapsedRealtime() - l10.longValue(), -1, null);
                                                }
                                                try {
                                                    ra.vt(vtVar.f11909ra);
                                                } catch (IOException e11) {
                                                    qbp.lh("MusicCacheManager", e11.getMessage());
                                                }
                                            }
                                            if (vtVar.pno || l10 == null) {
                                                return;
                                            }
                                            ouw.this.ouw(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else {
                    ko.vt("MusicCacheManager", "dynamic_creative have no music_url, not report music_preload_start");
                }
            }
        }
    }

    public final void vt() {
        String str;
        Context contextOuw = zih.ouw();
        boolean zLh = vt.lh();
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (vt.lh()) {
            str = name + "/music";
        } else {
            str = name + "//music";
        }
        ko.ouw("MusicCacheManager", "cachePath is:", str);
        File fileOuw = ra.ouw(contextOuw, zLh, str);
        ko.ouw("MusicCacheManager", "trimMusicFileCache, dir is ", fileOuw.getAbsolutePath());
        try {
            this.f12683lh.ouw(fileOuw);
        } catch (IOException e10) {
            qbp.ouw("MusicCacheManager", "trimFileCache fail", e10);
        }
    }
}
