package com.unity3d.ads.core.extensions;

import ck.p;
import java.io.File;
import java.util.LinkedList;

/* JADX INFO: compiled from: FileExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] fileArrListFiles;
        p.j(file, "<this>");
        long length = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (true) {
            if (!(!linkedList.isEmpty())) {
                return length;
            }
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                if (!(fileArrListFiles.length == 0)) {
                    for (File file3 : fileArrListFiles) {
                        if (file3.isDirectory()) {
                            p.i(file3, "child");
                            linkedList.add(file3);
                        } else {
                            length += file3.length();
                        }
                    }
                }
            }
        }
    }
}
