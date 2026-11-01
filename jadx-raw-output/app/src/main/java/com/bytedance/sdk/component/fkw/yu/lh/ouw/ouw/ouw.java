package com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.component.utils.tlj;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ouw {
    private int ouw;
    private File vt;

    public static ouw ouw(int i10, File file) {
        try {
            ouw ouwVar = new ouw(i10, file);
            if (file != null) {
                file.mkdirs();
            }
            return ouwVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private File vt(String str) {
        return new File(this.vt, str);
    }

    private ouw(int i10, File file) {
        this.ouw = i10;
        this.vt = file;
    }

    public final synchronized InputStream ouw(String str) {
        if (this.ouw <= 0) {
            return null;
        }
        File fileVt = vt(str);
        try {
            FileInputStream fileInputStream = new FileInputStream(fileVt);
            try {
                ra.vt(fileVt);
            } catch (Throwable unused) {
            }
            return fileInputStream;
        } catch (FileNotFoundException unused2) {
            tlj.ouw(null);
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public final synchronized boolean ouw(String str, byte[] bArr) {
        if (this.ouw > 0 && str != null && bArr != null) {
            File file = new File(this.vt, str + ".temp");
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file);
                try {
                    fileOutputStreamFileOutputStreamCtor.write(bArr);
                    if (file.exists()) {
                        File fileVt = vt(str);
                        if (fileVt.exists() && !fileVt.delete()) {
                            throw new IOException();
                        }
                        if (!file.renameTo(fileVt)) {
                            throw new IOException();
                        }
                    }
                    tlj.ouw(fileOutputStreamFileOutputStreamCtor);
                    List<File> listOuw = ouw(this.vt);
                    if (listOuw != null) {
                        int size = listOuw.size();
                        int i10 = this.ouw;
                        if (size > i10) {
                            ouw((int) (((double) i10) * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                    try {
                        File file2 = this.vt;
                        if (file2 != null) {
                            file2.mkdirs();
                        }
                        tlj.ouw(fileOutputStream);
                        List<File> listOuw2 = ouw(this.vt);
                        if (listOuw2 != null) {
                            int size2 = listOuw2.size();
                            int i11 = this.ouw;
                            if (size2 > i11) {
                                ouw((int) (((double) i11) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        tlj.ouw(fileOutputStream);
                        List<File> listOuw3 = ouw(this.vt);
                        if (listOuw3 != null) {
                            int size3 = listOuw3.size();
                            int i12 = this.ouw;
                            if (size3 > i12) {
                                ouw((int) (((double) i12) * 0.7d));
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                    tlj.ouw(fileOutputStream);
                    List<File> listOuw4 = ouw(this.vt);
                    if (listOuw4 != null) {
                        int size4 = listOuw4.size();
                        int i13 = this.ouw;
                        if (size4 > i13) {
                            ouw((int) (((double) i13) * 0.7d));
                        }
                    }
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }

    private static List<File> ouw(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private synchronized void ouw(int i10) {
        try {
            if (i10 > this.ouw) {
                return;
            }
            List<File> listOuw = ouw(this.vt);
            if (listOuw == null || listOuw.isEmpty()) {
                listOuw = null;
            } else {
                final HashMap map = new HashMap();
                for (File file : listOuw) {
                    map.put(file, Long.valueOf(file.lastModified()));
                }
                Collections.sort(listOuw, new Comparator<File>() { // from class: com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw.ouw.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(File file2, File file3) {
                        File file4 = file2;
                        File file5 = file3;
                        if (file4 == null && file5 == null) {
                            return 0;
                        }
                        if (file4 == null) {
                            return 1;
                        }
                        if (file5 == null) {
                            return -1;
                        }
                        return Long.compare(((Long) map.get(file5)).longValue(), ((Long) map.get(file4)).longValue());
                    }
                });
            }
            if (listOuw != null && listOuw.size() > i10) {
                while (i10 < listOuw.size()) {
                    File file2 = listOuw.get(i10);
                    if (file2 != null && file2.exists()) {
                        file2.delete();
                    }
                    i10++;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
