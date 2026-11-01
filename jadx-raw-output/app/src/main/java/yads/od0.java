package yads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yads.od0;

/* JADX INFO: loaded from: classes8.dex */
public final class od0 implements rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f81000a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nd0 f81001b = new nd0(new md0() { // from class: cp.m7
        @Override // yads.md0
        public final Constructor a() {
            return od0.a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd0 f81002c = new nd0(new md0() { // from class: cp.n7
        @Override // yads.md0
        public final Constructor a() {
            return od0.b();
        }
    });

    public static void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new f0());
                break;
            case 1:
                arrayList.add(new i0());
                break;
            case 2:
                arrayList.add(new pc());
                break;
            case 3:
                arrayList.add(new re());
                break;
            case 4:
                mq0 mq0VarA = f81001b.a(0);
                if (mq0VarA == null) {
                    arrayList.add(new tv0());
                } else {
                    arrayList.add(mq0VarA);
                }
                break;
            case 5:
                arrayList.add(new fw0());
                break;
            case 6:
                arrayList.add(new zi1(new jd0(), 0));
                break;
            case 7:
                arrayList.add(new iv1(0));
                break;
            case 8:
                arrayList.add(new sx0(Collections.emptyList()));
                arrayList.add(new kv1());
                break;
            case 9:
                arrayList.add(new m92());
                break;
            case 10:
                arrayList.add(new cl2(new y63(0L)));
                break;
            case 11:
                arrayList.add(new h93(0));
                break;
            case 12:
                arrayList.add(new ln3());
                break;
            case 14:
                arrayList.add(new ce1());
                break;
            case 15:
                mq0 mq0VarA2 = f81002c.a(new Object[0]);
                if (mq0VarA2 != null) {
                    arrayList.add(mq0VarA2);
                }
                break;
            case 16:
                arrayList.add(new yl());
                break;
        }
    }

    @Override // yads.rq0
    public final synchronized mq0[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    public static Constructor b() {
        return Class.forName("com.monetization.ads.exo.decoder.midi.MidiExtractor").asSubclass(mq0.class).getConstructor(new Class[0]);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x020b A[Catch: all -> 0x03a4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:167:0x020b, B:168:0x020e, B:268:0x0384, B:271:0x038a, B:274:0x0390, B:275:0x0393, B:276:0x0396, B:171:0x0216, B:173:0x021e, B:176:0x0228, B:179:0x0232, B:181:0x023a, B:184:0x0244, B:187:0x024f, B:190:0x025b, B:193:0x0267, B:195:0x026f, B:197:0x0277, B:200:0x0281, B:202:0x028f, B:205:0x0299, B:208:0x02a4, B:210:0x02ac, B:212:0x02ba, B:214:0x02c8, B:217:0x02d8, B:219:0x02e6, B:222:0x02f0, B:224:0x02f8, B:226:0x0300, B:228:0x0308, B:231:0x0312, B:233:0x031a, B:236:0x0329, B:238:0x0331, B:241:0x033a, B:243:0x0342, B:246:0x034b, B:248:0x0353, B:251:0x035c, B:13:0x003d, B:39:0x0083, B:40:0x0087, B:147:0x01df, B:42:0x008c, B:46:0x009a, B:50:0x00a8, B:54:0x00b6, B:58:0x00c4, B:62:0x00d2, B:66:0x00e0, B:70:0x00ee, B:74:0x00fc, B:78:0x010a, B:82:0x0117, B:86:0x0125, B:90:0x0132, B:94:0x013f, B:98:0x014d, B:102:0x015a, B:106:0x0167, B:110:0x0175, B:114:0x0182, B:118:0x018f, B:122:0x019a, B:126:0x01a6, B:130:0x01b2, B:134:0x01bd, B:138:0x01c8, B:142:0x01d3, B:20:0x0053, B:24:0x005e, B:28:0x0069), top: B:282:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0214  */
    /* JADX WARN: Code duplicated, block: B:171:0x0216 A[Catch: all -> 0x03a4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:167:0x020b, B:168:0x020e, B:268:0x0384, B:271:0x038a, B:274:0x0390, B:275:0x0393, B:276:0x0396, B:171:0x0216, B:173:0x021e, B:176:0x0228, B:179:0x0232, B:181:0x023a, B:184:0x0244, B:187:0x024f, B:190:0x025b, B:193:0x0267, B:195:0x026f, B:197:0x0277, B:200:0x0281, B:202:0x028f, B:205:0x0299, B:208:0x02a4, B:210:0x02ac, B:212:0x02ba, B:214:0x02c8, B:217:0x02d8, B:219:0x02e6, B:222:0x02f0, B:224:0x02f8, B:226:0x0300, B:228:0x0308, B:231:0x0312, B:233:0x031a, B:236:0x0329, B:238:0x0331, B:241:0x033a, B:243:0x0342, B:246:0x034b, B:248:0x0353, B:251:0x035c, B:13:0x003d, B:39:0x0083, B:40:0x0087, B:147:0x01df, B:42:0x008c, B:46:0x009a, B:50:0x00a8, B:54:0x00b6, B:58:0x00c4, B:62:0x00d2, B:66:0x00e0, B:70:0x00ee, B:74:0x00fc, B:78:0x010a, B:82:0x0117, B:86:0x0125, B:90:0x0132, B:94:0x013f, B:98:0x014d, B:102:0x015a, B:106:0x0167, B:110:0x0175, B:114:0x0182, B:118:0x018f, B:122:0x019a, B:126:0x01a6, B:130:0x01b2, B:134:0x01bd, B:138:0x01c8, B:142:0x01d3, B:20:0x0053, B:24:0x005e, B:28:0x0069), top: B:282:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x037f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x038a A[Catch: all -> 0x03a4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:167:0x020b, B:168:0x020e, B:268:0x0384, B:271:0x038a, B:274:0x0390, B:275:0x0393, B:276:0x0396, B:171:0x0216, B:173:0x021e, B:176:0x0228, B:179:0x0232, B:181:0x023a, B:184:0x0244, B:187:0x024f, B:190:0x025b, B:193:0x0267, B:195:0x026f, B:197:0x0277, B:200:0x0281, B:202:0x028f, B:205:0x0299, B:208:0x02a4, B:210:0x02ac, B:212:0x02ba, B:214:0x02c8, B:217:0x02d8, B:219:0x02e6, B:222:0x02f0, B:224:0x02f8, B:226:0x0300, B:228:0x0308, B:231:0x0312, B:233:0x031a, B:236:0x0329, B:238:0x0331, B:241:0x033a, B:243:0x0342, B:246:0x034b, B:248:0x0353, B:251:0x035c, B:13:0x003d, B:39:0x0083, B:40:0x0087, B:147:0x01df, B:42:0x008c, B:46:0x009a, B:50:0x00a8, B:54:0x00b6, B:58:0x00c4, B:62:0x00d2, B:66:0x00e0, B:70:0x00ee, B:74:0x00fc, B:78:0x010a, B:82:0x0117, B:86:0x0125, B:90:0x0132, B:94:0x013f, B:98:0x014d, B:102:0x015a, B:106:0x0167, B:110:0x0175, B:114:0x0182, B:118:0x018f, B:122:0x019a, B:126:0x01a6, B:130:0x01b2, B:134:0x01bd, B:138:0x01c8, B:142:0x01d3, B:20:0x0053, B:24:0x005e, B:28:0x0069), top: B:282:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x0393 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // yads.rq0
    public final synchronized mq0[] createExtractors(Uri uri, Map map) {
        ArrayList arrayList;
        byte b10;
        int i10;
        String lastPathSegment;
        int i11;
        int i12;
        int[] iArr = f81000a;
        arrayList = new ArrayList(16);
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        int i13 = 1;
        if (str != null) {
            ArrayList arrayList2 = ht1.f78370a;
            int iHashCode = str.hashCode();
            if (iHashCode != -1007807498) {
                if (iHashCode != -586683234) {
                    b10 = (iHashCode == 187090231 && str.equals("audio/mp3")) ? (byte) 2 : (byte) -1;
                } else if (str.equals("audio/x-wav")) {
                    b10 = 1;
                }
            } else if (str.equals("audio/x-flac")) {
                b10 = 0;
            }
            if (b10 == 0) {
                str = "audio/flac";
            } else if (b10 == 1) {
                str = "audio/wav";
            } else if (b10 == 2) {
                str = "audio/mpeg";
            }
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac3":
                case "audio/eac3":
                    i10 = 0;
                    break;
                case "video/mp2p":
                    i10 = 10;
                    break;
                case "video/mp2t":
                    i10 = 11;
                    break;
                case "video/webm":
                case "audio/x-matroska":
                case "application/webm":
                case "audio/webm":
                case "video/x-matroska":
                    i10 = 6;
                    break;
                case "audio/amr-wb":
                case "audio/amr":
                case "audio/3gpp":
                    i10 = 3;
                    break;
                case "image/jpeg":
                    i10 = 14;
                    break;
                case "application/mp4":
                case "audio/mp4":
                case "video/mp4":
                    i10 = 8;
                    break;
                case "video/x-msvideo":
                    i10 = 16;
                    break;
                case "text/vtt":
                    i10 = 13;
                    break;
                case "video/x-flv":
                    i10 = 5;
                    break;
                case "audio/ac4":
                    i10 = 1;
                    break;
                case "audio/ogg":
                    i10 = 9;
                    break;
                case "audio/wav":
                    i10 = 12;
                    break;
                case "audio/flac":
                    i10 = 4;
                    break;
                case "audio/midi":
                    i10 = 15;
                    break;
                case "audio/mpeg":
                    i10 = 7;
                    break;
                default:
                    break;
            }
            if (i10 != -1) {
                a(i10, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                    i13 = 0;
                } else if (!lastPathSegment.endsWith(".ac4")) {
                    if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i13 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i13 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i13 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i13 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i13 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i13 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i13 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i13 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i13 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i13 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i13 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i13 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i13 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i13 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i13 = 16;
                    }
                }
                if (i13 != -1 && i13 != i10) {
                    a(i13, arrayList);
                }
                for (i11 = 0; i11 < 16; i11++) {
                    i12 = iArr[i11];
                    if (i12 == i10 && i12 != i13) {
                        a(i12, arrayList);
                    }
                }
            }
            i13 = -1;
            if (i13 != -1) {
                a(i13, arrayList);
            }
            while (i11 < 16) {
                i12 = iArr[i11];
                if (i12 == i10) {
                }
            }
        }
        i10 = -1;
        if (i10 != -1) {
            a(i10, arrayList);
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            if (lastPathSegment.endsWith(".ac3")) {
                i13 = 0;
            } else {
                i13 = 0;
            }
            if (i13 != -1) {
                a(i13, arrayList);
            }
            while (i11 < 16) {
                i12 = iArr[i11];
                if (i12 == i10) {
                }
            }
        }
        i13 = -1;
        if (i13 != -1) {
            a(i13, arrayList);
        }
        while (i11 < 16) {
            i12 = iArr[i11];
            if (i12 == i10) {
            }
        }
        return (mq0[]) arrayList.toArray(new mq0[arrayList.size()]);
    }

    public static Constructor a() {
        if (Boolean.TRUE.equals(Class.forName("com.monetization.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.monetization.ads.exo.ext.flac.FlacExtractor").asSubclass(mq0.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
