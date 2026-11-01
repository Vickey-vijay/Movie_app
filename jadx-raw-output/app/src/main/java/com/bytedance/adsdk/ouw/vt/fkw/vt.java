package com.bytedance.adsdk.ouw.vt.fkw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.bly;
import com.bytedance.adsdk.ouw.vt.vt.ouw.cf;
import com.bytedance.adsdk.ouw.vt.vt.ouw.fkw;
import com.bytedance.adsdk.ouw.vt.vt.ouw.jg;
import com.bytedance.adsdk.ouw.vt.vt.ouw.le;
import com.bytedance.adsdk.ouw.vt.vt.ouw.mwh;
import com.bytedance.adsdk.ouw.vt.vt.ouw.pno;
import com.bytedance.adsdk.ouw.vt.vt.ouw.ryl;
import com.bytedance.adsdk.ouw.vt.vt.ouw.th;
import com.bytedance.adsdk.ouw.vt.vt.ouw.vm;
import com.bytedance.adsdk.ouw.vt.vt.ouw.zih;
import com.bytedance.adsdk.ouw.vt.yu.lh;
import com.bytedance.adsdk.ouw.vt.yu.yu;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class vt {
    public static com.bytedance.adsdk.ouw.vt.vt.ouw ouw(List<com.bytedance.adsdk.ouw.vt.vt.ouw> list, String str, int i10) {
        lh(list, str, i10);
        Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> dequeOuw = ouw(vt(list, str, i10));
        if (dequeOuw.size() == 1) {
            return dequeOuw.getFirst();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ouw.vt.fkw.vt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[lh.values().length];
            ouw = iArr;
            try {
                iArr[lh.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[lh.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[lh.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[lh.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[lh.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[lh.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[lh.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ouw[lh.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ouw[lh.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ouw[lh.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ouw[lh.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ouw[lh.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ouw[lh.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> vt(List<com.bytedance.adsdk.ouw.vt.vt.ouw> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.ouw.vt.vt.ouw> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar : linkedList) {
                if (!linkedList2.isEmpty() && lh.ouw(((com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList2.peekLast()).ouw()) && ((lh) ((com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList2.peekLast()).ouw()).zih == i11) {
                    com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar2 = (com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList2.pollLast();
                    com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar3 = (com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList2.pollLast();
                    if (lh.ouw(ouwVar3.ouw()) || lh.ouw(ouwVar.ouw())) {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                    linkedList2.addLast(ouw(ouwVar3, ouwVar2, ouwVar));
                } else {
                    linkedList2.addLast(ouwVar);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static void lh(List<com.bytedance.adsdk.ouw.vt.vt.ouw> list, String str, int i10) {
        Iterator<com.bytedance.adsdk.ouw.vt.vt.ouw> it = list.iterator();
        while (it.hasNext()) {
            if (yu.ouw(it.next().ouw())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> ouw(Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList.peekLast()).ouw() == lh.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar2 = (com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList.pollLast();
                if (((com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList.pollLast()).ouw() == lh.QUESTION) {
                    com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar3 = (com.bytedance.adsdk.ouw.vt.vt.ouw) linkedList.pollLast();
                    th thVar = new th();
                    thVar.ouw(ouwVar3);
                    thVar.vt(ouwVar2);
                    thVar.lh(ouwVar);
                    linkedList.addLast(thVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(ouwVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.ouw.vt.vt.ouw ouw(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar, com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar2, com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar3) {
        zih cfVar;
        switch (AnonymousClass1.ouw[((lh) ouwVar2.ouw()).ordinal()]) {
            case 1:
                cfVar = new cf();
                break;
            case 2:
                cfVar = new vm();
                break;
            case 3:
                cfVar = new com.bytedance.adsdk.ouw.vt.vt.ouw.ouw();
                break;
            case 4:
                cfVar = new mwh();
                break;
            case 5:
                cfVar = new ryl();
                break;
            case 6:
                cfVar = new com.bytedance.adsdk.ouw.vt.vt.ouw.yu();
                break;
            case 7:
                cfVar = new jg();
                break;
            case 8:
                cfVar = new le();
                break;
            case 9:
                cfVar = new bly();
                break;
            case 10:
                cfVar = new fkw();
                break;
            case 11:
                cfVar = new pno();
                break;
            case 12:
                cfVar = new com.bytedance.adsdk.ouw.vt.vt.ouw.vt();
                break;
            case 13:
                cfVar = new com.bytedance.adsdk.ouw.vt.vt.ouw.lh();
                break;
            default:
                throw new UnsupportedOperationException(ouwVar2.ouw().toString());
        }
        cfVar.ouw(ouwVar);
        cfVar.vt(ouwVar3);
        return cfVar;
    }

    public static boolean ouw(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
