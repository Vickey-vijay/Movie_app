package com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw implements com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt {
    private String ouw = "video_reward_full";
    private String vt = "video_brand";

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f10488lh = "video_splash";
    private String yu = "video_default";
    private String fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private String f10487le = null;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private String f10489ra = null;
    private String pno = null;
    private String bly = null;

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt
    public final void ouw(String str) {
        this.fkw = str;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt
    public final String vt() {
        if (this.pno == null) {
            this.pno = this.fkw + File.separator + this.f10488lh;
            File file = new File(this.pno);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.pno;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt
    public final synchronized void yu() {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("Exec clear video cache ");
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt(this.fkw);
        ArrayList<com.bykv.vk.openvk.ouw.ouw.ouw.ouw.ouw> arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.ouw.ouw.ouw.ouw.ouw(new File(ouw()).listFiles(), com.bykv.vk.openvk.ouw.ouw.vt.ouw.lh()));
        arrayList.add(new com.bykv.vk.openvk.ouw.ouw.ouw.ouw.ouw(new File(vt()).listFiles(), com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt()));
        if (this.f10489ra == null) {
            this.f10489ra = this.fkw + File.separator + this.vt;
            File file = new File(this.f10489ra);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        arrayList.add(new com.bykv.vk.openvk.ouw.ouw.ouw.ouw.ouw(new File(this.f10489ra).listFiles(), com.bykv.vk.openvk.ouw.ouw.vt.ouw.yu()));
        arrayList.add(new com.bykv.vk.openvk.ouw.ouw.ouw.ouw.ouw(new File(lh()).listFiles(), com.bykv.vk.openvk.ouw.ouw.vt.ouw.fkw()));
        Set<String> setFkw = null;
        for (com.bykv.vk.openvk.ouw.ouw.ouw.ouw.ouw ouwVar : arrayList) {
            File[] fileArr = ouwVar.ouw;
            if (fileArr != null && fileArr.length >= ouwVar.vt) {
                if (setFkw == null) {
                    setFkw = fkw();
                }
                int i10 = ouwVar.vt - 2;
                if (i10 < 0) {
                    i10 = 0;
                }
                ouw(ouwVar.ouw, i10, setFkw);
            }
        }
    }

    private static Set<String> fkw() {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2;
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw ouwVar : com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.ouw.values()) {
            if (ouwVar != null && (lhVar2 = ouwVar.vt) != null) {
                hashSet.add(com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(lhVar2.f10446lh, lhVar2.bly()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.vt(lhVar2.f10446lh, lhVar2.bly()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt vtVar : com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.lh.ouw.values()) {
            if (vtVar != null && (lhVar = vtVar.ouw) != null) {
                hashSet.add(com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(lhVar.f10446lh, lhVar.bly()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.vt(lhVar.f10446lh, lhVar.bly()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt
    public final String lh() {
        if (this.bly == null) {
            this.bly = this.fkw + File.separator + this.yu;
            File file = new File(this.bly);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.bly;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt
    public final String ouw() {
        if (this.f10487le == null) {
            this.f10487le = this.fkw + File.separator + this.ouw;
            File file = new File(this.f10487le);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f10487le;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt
    public final long vt(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        if (!TextUtils.isEmpty(lhVar.f10446lh) && !TextUtils.isEmpty(lhVar.bly())) {
            String str = lhVar.f10446lh;
            String strBly = lhVar.bly();
            File fileVt = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.vt(str, strBly);
            if (fileVt.exists()) {
                return fileVt.length();
            }
            File fileOuw = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(str, strBly);
            if (fileOuw.exists()) {
                return fileOuw.length();
            }
        }
        return 0L;
    }

    private static void ouw(File[] fileArr, int i10, Set<String> set) {
        if (i10 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i10) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.ouw.1
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i10 < listAsList.size()) {
                        File file = (File) listAsList.get(i10);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i10)).delete();
                        }
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt
    public final boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        if (TextUtils.isEmpty(lhVar.f10446lh) || TextUtils.isEmpty(lhVar.bly())) {
            return false;
        }
        return new File(lhVar.f10446lh, lhVar.bly()).exists();
    }
}
