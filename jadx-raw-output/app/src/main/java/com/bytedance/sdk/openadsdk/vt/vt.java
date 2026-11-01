package com.bytedance.sdk.openadsdk.vt;

import com.bytedance.sdk.component.utils.ko;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public class vt extends ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f13467lh;
    private int vt;
    private volatile boolean yu;

    public vt(int i10, int i11) {
        this.vt = 15;
        this.f13467lh = 3;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.vt = i10;
        this.f13467lh = i11;
    }

    @Override // com.bytedance.sdk.openadsdk.vt.ouw
    public final boolean ouw(int i10) {
        return i10 <= this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.vt.ouw
    public void ouw(List<File> list) {
        if (!this.yu) {
            lh(list);
            return;
        }
        if (list != null) {
            try {
                if (list.size() != 0) {
                    ouw.vt(list);
                    int size = list.size();
                    boolean zOuw = ouw(size);
                    if (!zOuw) {
                        TreeMap treeMap = new TreeMap();
                        for (File file : list) {
                            treeMap.put(Long.valueOf(file.lastModified()), file);
                        }
                        for (Map.Entry entry : treeMap.entrySet()) {
                            if (entry != null && !zOuw) {
                                ((Long) entry.getKey()).longValue();
                                File file2 = (File) entry.getValue();
                                file2.length();
                                if (file2.delete()) {
                                    size--;
                                }
                                if (vt(size)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        ko.lh("splashLoadAd", "Do not meet the delete condition, do not perform a delete operation(true)".concat(String.valueOf(zOuw)));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.yu = false;
    }

    @Override // com.bytedance.sdk.openadsdk.vt.ouw
    public final boolean vt(int i10) {
        return i10 <= this.f13467lh;
    }

    private void lh(List<File> list) {
        ouw.vt(list);
        int size = list.size();
        if (!ouw(size)) {
            for (File file : list) {
                file.length();
                if (file.delete()) {
                    size--;
                }
                if (vt(size)) {
                    return;
                }
            }
        }
    }

    public vt() {
        this.vt = 10;
        this.f13467lh = 8;
        this.yu = true;
    }
}
