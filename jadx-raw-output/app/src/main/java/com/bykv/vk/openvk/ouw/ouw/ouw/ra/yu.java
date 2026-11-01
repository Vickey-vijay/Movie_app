package com.bykv.vk.openvk.ouw.ouw.ouw.ra;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class yu {
    public static JSONArray ouw() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        HashSet hashSet = new HashSet();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equals("video/hevc") && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc")) != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            hashSet.add(ouw(codecProfileLevel.level));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    private static String ouw(int i10) {
        for (Field field : MediaCodecInfo.CodecProfileLevel.class.getFields()) {
            String name = field.getName();
            if (field.getType() == Integer.TYPE && name.contains("HEVC")) {
                try {
                    if (field.getInt(null) == i10) {
                        return name;
                    }
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return String.valueOf(i10);
    }

    public static int ouw(File file) throws Throwable {
        if (file != null && file.exists()) {
            long length = file.length();
            if (length <= 0) {
                return -1;
            }
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8];
                    long j10 = 0;
                    while (fileInputStream2.read(bArr) == 8) {
                        long j11 = ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (255 & ((long) bArr[3]));
                        if (bArr[4] != 109 || bArr[5] != 111 || bArr[6] != 111 || bArr[7] != 118) {
                            long j12 = j11 - 8;
                            if (j12 > 0 && fileInputStream2.skip(j12) < j12) {
                                break;
                            }
                            j10 += j11;
                        } else {
                            break;
                        }
                    }
                    int i10 = (int) ((j10 * 100.0f) / length);
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused) {
                    }
                    return i10;
                } catch (Exception unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return -1;
    }
}
