package sg.bigo.ads.core.e.a;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f71319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f71320g = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f71323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f71324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f71325e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<f> f71321a = p.a(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f71322b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f71326h = new Runnable() { // from class: sg.bigo.ads.core.e.a.d.2
        /* JADX WARN: Code duplicated, block: B:107:0x02ad A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x02a1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:42:0x013a  */
        /* JADX WARN: Code duplicated, block: B:44:0x013f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0144  */
        /* JADX WARN: Code duplicated, block: B:47:0x014c  */
        /* JADX WARN: Code duplicated, block: B:48:0x015d  */
        /* JADX WARN: Code duplicated, block: B:51:0x0173  */
        /* JADX WARN: Code duplicated, block: B:53:0x0183  */
        /* JADX WARN: Code duplicated, block: B:54:0x018a  */
        /* JADX WARN: Code duplicated, block: B:56:0x019c  */
        /* JADX WARN: Code duplicated, block: B:62:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:64:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:66:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:67:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:72:0x020c  */
        /* JADX WARN: Code duplicated, block: B:73:0x0215  */
        /* JADX WARN: Code duplicated, block: B:75:0x0227  */
        /* JADX WARN: Code duplicated, block: B:81:0x025f  */
        /* JADX WARN: Code duplicated, block: B:88:0x027f  */
        /* JADX WARN: Code duplicated, block: B:90:0x0282  */
        /* JADX WARN: Code duplicated, block: B:92:0x02a6  */
        /* JADX WARN: Instruction removed from duplicated block: B:27:0x00c5, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:47:0x014c, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:66:0x01d7, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:90:0x0282, please report this as an issue */
        @Override // java.lang.Runnable
        @SuppressLint({"ConcurrentModification", "IteratorRemove"})
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            int size;
            String str;
            int size2;
            int iB;
            int i14;
            String str2;
            int size3;
            int i15;
            int iC;
            int i16;
            String str3;
            int size4;
            int i17;
            String str4;
            int i18;
            boolean z10;
            int iD = 0;
            int i19 = 3;
            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "mRetryTrackerRunnable. maybe trackInfoNum=" + d.this.f71321a.size());
            Iterator it = d.this.f71321a.iterator();
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = iD;
                    i11 = i19;
                    break;
                }
                f fVar = (f) it.next();
                Context context = d.this.f71325e;
                if (fVar.f71354s == null) {
                    sg.bigo.ads.common.t.a.b("TrackerInfo", "retryThirdTrackImpl mThirdImpressionTrack is error.");
                } else {
                    if (fVar.a(fVar.f71344i)) {
                        size = fVar.f71354s.size();
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackImpl implTrackNum = ".concat(String.valueOf(size)));
                        if (size != 0) {
                            if (fVar.f71352q.a(fVar.f71345j, System.currentTimeMillis())) {
                                fVar.f71345j = System.currentTimeMillis();
                                fVar.f71344i++;
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackImpl mTrytimes = " + fVar.f71344i);
                                fVar.a(context);
                            } else {
                                str = "retryThirdTrackImpl interval limit";
                            }
                        }
                        if (fVar.f71355t == null) {
                            str2 = "retryThirdTrackClick not perform trackThirdClick";
                        } else if (fVar.a(fVar.f71346k)) {
                            size2 = fVar.f71355t.size();
                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackClick clickTrackNum = ".concat(String.valueOf(size2)));
                            if (size2 != 0) {
                                iB = iD;
                            } else if (fVar.f71352q.a(fVar.f71347l, System.currentTimeMillis())) {
                                fVar.f71347l = System.currentTimeMillis();
                                fVar.f71346k++;
                                iB = fVar.b(context);
                                if (iB == 0 && (i14 = fVar.f71346k) > 0) {
                                    fVar.f71346k = i14 - 1;
                                }
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackClick Real clickTrackNum = ".concat(String.valueOf(iB)));
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackClick mTrytimes = " + fVar.f71346k);
                            } else {
                                str2 = "retryThirdTrackClick interval limit";
                            }
                            if (fVar.f71356u == null) {
                                str3 = "retryBiddingNUrl not perform.";
                            } else {
                                if (fVar.a(fVar.f71348m)) {
                                    size3 = fVar.f71356u.size();
                                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                                    if (size3 == 0) {
                                        iC = iD;
                                        i15 = size;
                                    } else {
                                        i15 = size;
                                        if (fVar.f71352q.a(fVar.f71349n, System.currentTimeMillis())) {
                                            fVar.f71349n = System.currentTimeMillis();
                                            fVar.f71348m++;
                                            iC = fVar.c(context);
                                            if (iC == 0 && (i16 = fVar.f71348m) > 0) {
                                                fVar.f71348m = i16 - 1;
                                            }
                                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.f71348m);
                                        } else {
                                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl interval limit");
                                            iC = iD;
                                        }
                                    }
                                } else {
                                    str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.f71348m;
                                }
                                if (fVar.f71357v == null) {
                                    str4 = "retryBiddingLUrl not perform.";
                                } else {
                                    if (fVar.a(fVar.f71350o)) {
                                        size4 = fVar.f71357v.size();
                                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                        if (size4 != 0) {
                                            if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                                fVar.f71351p = System.currentTimeMillis();
                                                fVar.f71350o++;
                                                iD = fVar.d(context);
                                                if (iD == 0 && (i17 = fVar.f71350o) > 0) {
                                                    fVar.f71350o = i17 - 1;
                                                }
                                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                                            } else {
                                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                                iD = 0;
                                            }
                                        }
                                    } else {
                                        str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                                    }
                                    i18 = iD + i15 + iB + iC;
                                    if (!fVar.a(fVar.f71354s, fVar.f71344i) && fVar.a(fVar.f71355t, fVar.f71346k) && fVar.a(fVar.f71356u, fVar.f71348m) && fVar.a(fVar.f71357v, fVar.f71350o)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = 3;
                                        i10 = 0;
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                        g gVar = g.a.f71361a;
                                        g.b(fVar);
                                        it.remove();
                                    } else {
                                        i11 = 3;
                                        i10 = 0;
                                        i21 += i18;
                                        if (i21 > 20) {
                                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                            i20 = i18;
                                            break;
                                        }
                                    }
                                    i20 = i18;
                                    i19 = i11;
                                    iD = i10;
                                }
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                                i18 = iD + i15 + iB + iC;
                                if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i11 = 3;
                                    i10 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                    g gVar2 = g.a.f71361a;
                                    g.b(fVar);
                                    it.remove();
                                } else {
                                    i11 = 3;
                                    i10 = 0;
                                    i21 += i18;
                                    if (i21 > 20) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                        i20 = i18;
                                        break;
                                    }
                                }
                                i20 = i18;
                                i19 = i11;
                                iD = i10;
                            }
                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str3);
                            iC = iD;
                            i15 = size;
                            if (fVar.f71357v == null) {
                                str4 = "retryBiddingLUrl not perform.";
                            } else {
                                if (fVar.a(fVar.f71350o)) {
                                    str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                                } else {
                                    size4 = fVar.f71357v.size();
                                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                    if (size4 != 0) {
                                        if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                            iD = 0;
                                        } else {
                                            fVar.f71351p = System.currentTimeMillis();
                                            fVar.f71350o++;
                                            iD = fVar.d(context);
                                            if (iD == 0) {
                                                fVar.f71350o = i17 - 1;
                                            }
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                                        }
                                    }
                                }
                                i18 = iD + i15 + iB + iC;
                                if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i11 = 3;
                                    i10 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                    g gVar3 = g.a.f71361a;
                                    g.b(fVar);
                                    it.remove();
                                } else {
                                    i11 = 3;
                                    i10 = 0;
                                    i21 += i18;
                                    if (i21 > 20) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                        i20 = i18;
                                        break;
                                    }
                                }
                                i20 = i18;
                                i19 = i11;
                                iD = i10;
                            }
                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                            i18 = iD + i15 + iB + iC;
                            if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i11 = 3;
                                i10 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                g gVar4 = g.a.f71361a;
                                g.b(fVar);
                                it.remove();
                            } else {
                                i11 = 3;
                                i10 = 0;
                                i21 += i18;
                                if (i21 > 20) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                    i20 = i18;
                                    break;
                                }
                            }
                            i20 = i18;
                            i19 = i11;
                            iD = i10;
                        } else {
                            str2 = "retryThirdTrackClick times limit. mTrytimes = " + fVar.f71346k;
                        }
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str2);
                        iB = iD;
                        if (fVar.f71356u == null) {
                            str3 = "retryBiddingNUrl not perform.";
                        } else {
                            if (fVar.a(fVar.f71348m)) {
                                str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.f71348m;
                            } else {
                                size3 = fVar.f71356u.size();
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                                if (size3 == 0) {
                                    iC = iD;
                                    i15 = size;
                                } else {
                                    i15 = size;
                                    if (fVar.f71352q.a(fVar.f71349n, System.currentTimeMillis())) {
                                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl interval limit");
                                        iC = iD;
                                    } else {
                                        fVar.f71349n = System.currentTimeMillis();
                                        fVar.f71348m++;
                                        iC = fVar.c(context);
                                        if (iC == 0) {
                                            fVar.f71348m = i16 - 1;
                                        }
                                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.f71348m);
                                    }
                                }
                            }
                            if (fVar.f71357v == null) {
                                str4 = "retryBiddingLUrl not perform.";
                            } else {
                                if (fVar.a(fVar.f71350o)) {
                                    str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                                } else {
                                    size4 = fVar.f71357v.size();
                                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                    if (size4 != 0) {
                                        if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                            iD = 0;
                                        } else {
                                            fVar.f71351p = System.currentTimeMillis();
                                            fVar.f71350o++;
                                            iD = fVar.d(context);
                                            if (iD == 0) {
                                                fVar.f71350o = i17 - 1;
                                            }
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                            sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                                        }
                                    }
                                }
                                i18 = iD + i15 + iB + iC;
                                if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i11 = 3;
                                    i10 = 0;
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                    g gVar5 = g.a.f71361a;
                                    g.b(fVar);
                                    it.remove();
                                } else {
                                    i11 = 3;
                                    i10 = 0;
                                    i21 += i18;
                                    if (i21 > 20) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                        i20 = i18;
                                        break;
                                    }
                                }
                                i20 = i18;
                                i19 = i11;
                                iD = i10;
                            }
                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                            i18 = iD + i15 + iB + iC;
                            if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i11 = 3;
                                i10 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                g gVar6 = g.a.f71361a;
                                g.b(fVar);
                                it.remove();
                            } else {
                                i11 = 3;
                                i10 = 0;
                                i21 += i18;
                                if (i21 > 20) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                    i20 = i18;
                                    break;
                                }
                            }
                            i20 = i18;
                            i19 = i11;
                            iD = i10;
                        }
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str3);
                        iC = iD;
                        i15 = size;
                        if (fVar.f71357v == null) {
                            str4 = "retryBiddingLUrl not perform.";
                        } else {
                            if (fVar.a(fVar.f71350o)) {
                                str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                            } else {
                                size4 = fVar.f71357v.size();
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                if (size4 != 0) {
                                    if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                        iD = 0;
                                    } else {
                                        fVar.f71351p = System.currentTimeMillis();
                                        fVar.f71350o++;
                                        iD = fVar.d(context);
                                        if (iD == 0) {
                                            fVar.f71350o = i17 - 1;
                                        }
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                                    }
                                }
                            }
                            i18 = iD + i15 + iB + iC;
                            if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i11 = 3;
                                i10 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                g gVar7 = g.a.f71361a;
                                g.b(fVar);
                                it.remove();
                            } else {
                                i11 = 3;
                                i10 = 0;
                                i21 += i18;
                                if (i21 > 20) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                    i20 = i18;
                                    break;
                                }
                            }
                            i20 = i18;
                            i19 = i11;
                            iD = i10;
                        }
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                        i18 = iD + i15 + iB + iC;
                        if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i11 = 3;
                            i10 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                            g gVar8 = g.a.f71361a;
                            g.b(fVar);
                            it.remove();
                        } else {
                            i11 = 3;
                            i10 = 0;
                            i21 += i18;
                            if (i21 > 20) {
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                i20 = i18;
                                break;
                            }
                        }
                        i20 = i18;
                        i19 = i11;
                        iD = i10;
                    } else {
                        str = "retryThirdTrackImpl times limit. mTrytimes = " + fVar.f71344i;
                    }
                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str);
                }
                size = iD;
                if (fVar.f71355t == null) {
                    str2 = "retryThirdTrackClick not perform trackThirdClick";
                } else if (fVar.a(fVar.f71346k)) {
                    str2 = "retryThirdTrackClick times limit. mTrytimes = " + fVar.f71346k;
                } else {
                    size2 = fVar.f71355t.size();
                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackClick clickTrackNum = ".concat(String.valueOf(size2)));
                    if (size2 != 0) {
                        iB = iD;
                    } else if (fVar.f71352q.a(fVar.f71347l, System.currentTimeMillis())) {
                        str2 = "retryThirdTrackClick interval limit";
                    } else {
                        fVar.f71347l = System.currentTimeMillis();
                        fVar.f71346k++;
                        iB = fVar.b(context);
                        if (iB == 0) {
                            fVar.f71346k = i14 - 1;
                        }
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackClick Real clickTrackNum = ".concat(String.valueOf(iB)));
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryThirdTrackClick mTrytimes = " + fVar.f71346k);
                    }
                    if (fVar.f71356u == null) {
                        str3 = "retryBiddingNUrl not perform.";
                    } else {
                        if (fVar.a(fVar.f71348m)) {
                            str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.f71348m;
                        } else {
                            size3 = fVar.f71356u.size();
                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                            if (size3 == 0) {
                                iC = iD;
                                i15 = size;
                            } else {
                                i15 = size;
                                if (fVar.f71352q.a(fVar.f71349n, System.currentTimeMillis())) {
                                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl interval limit");
                                    iC = iD;
                                } else {
                                    fVar.f71349n = System.currentTimeMillis();
                                    fVar.f71348m++;
                                    iC = fVar.c(context);
                                    if (iC == 0) {
                                        fVar.f71348m = i16 - 1;
                                    }
                                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.f71348m);
                                }
                            }
                        }
                        if (fVar.f71357v == null) {
                            str4 = "retryBiddingLUrl not perform.";
                        } else {
                            if (fVar.a(fVar.f71350o)) {
                                str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                            } else {
                                size4 = fVar.f71357v.size();
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                                if (size4 != 0) {
                                    if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                        iD = 0;
                                    } else {
                                        fVar.f71351p = System.currentTimeMillis();
                                        fVar.f71350o++;
                                        iD = fVar.d(context);
                                        if (iD == 0) {
                                            fVar.f71350o = i17 - 1;
                                        }
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                        sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                                    }
                                }
                            }
                            i18 = iD + i15 + iB + iC;
                            if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i11 = 3;
                                i10 = 0;
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                                g gVar9 = g.a.f71361a;
                                g.b(fVar);
                                it.remove();
                            } else {
                                i11 = 3;
                                i10 = 0;
                                i21 += i18;
                                if (i21 > 20) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                    i20 = i18;
                                    break;
                                }
                            }
                            i20 = i18;
                            i19 = i11;
                            iD = i10;
                        }
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                        i18 = iD + i15 + iB + iC;
                        if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i11 = 3;
                            i10 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                            g gVar10 = g.a.f71361a;
                            g.b(fVar);
                            it.remove();
                        } else {
                            i11 = 3;
                            i10 = 0;
                            i21 += i18;
                            if (i21 > 20) {
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                i20 = i18;
                                break;
                            }
                        }
                        i20 = i18;
                        i19 = i11;
                        iD = i10;
                    }
                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str3);
                    iC = iD;
                    i15 = size;
                    if (fVar.f71357v == null) {
                        str4 = "retryBiddingLUrl not perform.";
                    } else {
                        if (fVar.a(fVar.f71350o)) {
                            str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                        } else {
                            size4 = fVar.f71357v.size();
                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                            if (size4 != 0) {
                                if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                    iD = 0;
                                } else {
                                    fVar.f71351p = System.currentTimeMillis();
                                    fVar.f71350o++;
                                    iD = fVar.d(context);
                                    if (iD == 0) {
                                        fVar.f71350o = i17 - 1;
                                    }
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                                }
                            }
                        }
                        i18 = iD + i15 + iB + iC;
                        if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i11 = 3;
                            i10 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                            g gVar11 = g.a.f71361a;
                            g.b(fVar);
                            it.remove();
                        } else {
                            i11 = 3;
                            i10 = 0;
                            i21 += i18;
                            if (i21 > 20) {
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                i20 = i18;
                                break;
                            }
                        }
                        i20 = i18;
                        i19 = i11;
                        iD = i10;
                    }
                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                    i18 = iD + i15 + iB + iC;
                    if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i11 = 3;
                        i10 = 0;
                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                        g gVar12 = g.a.f71361a;
                        g.b(fVar);
                        it.remove();
                    } else {
                        i11 = 3;
                        i10 = 0;
                        i21 += i18;
                        if (i21 > 20) {
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                            i20 = i18;
                            break;
                        }
                    }
                    i20 = i18;
                    i19 = i11;
                    iD = i10;
                }
                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str2);
                iB = iD;
                if (fVar.f71356u == null) {
                    str3 = "retryBiddingNUrl not perform.";
                } else {
                    if (fVar.a(fVar.f71348m)) {
                        str3 = "retryBiddingNUrl times limit. mTrytimes = " + fVar.f71348m;
                    } else {
                        size3 = fVar.f71356u.size();
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl trackNum = ".concat(String.valueOf(size3)));
                        if (size3 == 0) {
                            iC = iD;
                            i15 = size;
                        } else {
                            i15 = size;
                            if (fVar.f71352q.a(fVar.f71349n, System.currentTimeMillis())) {
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl interval limit");
                                iC = iD;
                            } else {
                                fVar.f71349n = System.currentTimeMillis();
                                fVar.f71348m++;
                                iC = fVar.c(context);
                                if (iC == 0) {
                                    fVar.f71348m = i16 - 1;
                                }
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl Real trackNum = ".concat(String.valueOf(iC)));
                                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingNUrl mTrytimes = " + fVar.f71348m);
                            }
                        }
                    }
                    if (fVar.f71357v == null) {
                        str4 = "retryBiddingLUrl not perform.";
                    } else {
                        if (fVar.a(fVar.f71350o)) {
                            str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                        } else {
                            size4 = fVar.f71357v.size();
                            sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                            if (size4 != 0) {
                                if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                    iD = 0;
                                } else {
                                    fVar.f71351p = System.currentTimeMillis();
                                    fVar.f71350o++;
                                    iD = fVar.d(context);
                                    if (iD == 0) {
                                        fVar.f71350o = i17 - 1;
                                    }
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                                }
                            }
                        }
                        i18 = iD + i15 + iB + iC;
                        if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i11 = 3;
                            i10 = 0;
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                            g gVar13 = g.a.f71361a;
                            g.b(fVar);
                            it.remove();
                        } else {
                            i11 = 3;
                            i10 = 0;
                            i21 += i18;
                            if (i21 > 20) {
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                                i20 = i18;
                                break;
                            }
                        }
                        i20 = i18;
                        i19 = i11;
                        iD = i10;
                    }
                    sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                    i18 = iD + i15 + iB + iC;
                    if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i11 = 3;
                        i10 = 0;
                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                        g gVar14 = g.a.f71361a;
                        g.b(fVar);
                        it.remove();
                    } else {
                        i11 = 3;
                        i10 = 0;
                        i21 += i18;
                        if (i21 > 20) {
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                            i20 = i18;
                            break;
                        }
                    }
                    i20 = i18;
                    i19 = i11;
                    iD = i10;
                }
                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str3);
                iC = iD;
                i15 = size;
                if (fVar.f71357v == null) {
                    str4 = "retryBiddingLUrl not perform.";
                } else {
                    if (fVar.a(fVar.f71350o)) {
                        str4 = "retryBiddingLUrl times limit. mTrytimes = " + fVar.f71350o;
                    } else {
                        size4 = fVar.f71357v.size();
                        sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", "retryBiddingLUrl trackNum = ".concat(String.valueOf(size4)));
                        if (size4 != 0) {
                            if (fVar.f71352q.a(fVar.f71351p, System.currentTimeMillis())) {
                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl interval limit");
                                iD = 0;
                            } else {
                                fVar.f71351p = System.currentTimeMillis();
                                fVar.f71350o++;
                                iD = fVar.d(context);
                                if (iD == 0) {
                                    fVar.f71350o = i17 - 1;
                                }
                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl Real trackNum = ".concat(String.valueOf(iD)));
                                sg.bigo.ads.common.t.a.a(0, 3, "TrackerInfo", "retryBiddingLUrl mTrytimes = " + fVar.f71350o);
                            }
                        }
                    }
                    i18 = iD + i15 + iB + iC;
                    if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i11 = 3;
                        i10 = 0;
                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                        g gVar15 = g.a.f71361a;
                        g.b(fVar);
                        it.remove();
                    } else {
                        i11 = 3;
                        i10 = 0;
                        i21 += i18;
                        if (i21 > 20) {
                            sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                            i20 = i18;
                            break;
                        }
                    }
                    i20 = i18;
                    i19 = i11;
                    iD = i10;
                }
                sg.bigo.ads.common.t.a.a(iD, i19, "TrackerInfo", str4);
                i18 = iD + i15 + iB + iC;
                if (!fVar.a(fVar.f71354s, fVar.f71344i)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = 3;
                    i10 = 0;
                    sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "allThirdTrackDone trackInfo=" + fVar.toString());
                    g gVar16 = g.a.f71361a;
                    g.b(fVar);
                    it.remove();
                } else {
                    i11 = 3;
                    i10 = 0;
                    i21 += i18;
                    if (i21 > 20) {
                        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "track num exceeded the limit. trackNum=".concat(String.valueOf(i21)));
                        i20 = i18;
                        break;
                    }
                }
                i20 = i18;
                i19 = i11;
                iD = i10;
            }
            sg.bigo.ads.common.t.a.a(i10, i11, "RetryTrackerManager", "mRetryTrackerRunnable. actually trackNum=".concat(String.valueOf(i20)));
            if (d.this.f71321a.size() == 0) {
                Set set = d.this.f71321a;
                g gVar17 = g.a.f71361a;
                set.addAll(g.a(1800000L, d.this.f71323c));
                i12 = 3;
                i13 = 0;
                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "mRetryTrackerRunnable. append, trackers=" + d.this.f71321a.size());
            } else {
                i12 = 3;
                i13 = 0;
            }
            sg.bigo.ads.common.t.a.a(i13, i12, "RetryTrackerManager", "mRetryTrackerRunnable.trackers=" + d.this.f71321a.size());
            if (d.this.f71321a.size() > 0) {
                sg.bigo.ads.common.n.d.a(1, d.this.f71326h, 20000L);
            } else {
                sg.bigo.ads.common.t.a.a(i13, i12, "RetryTrackerManager", "mRetryTrackerRunnable. stop looping");
                d.c();
            }
        }
    };

    public static d a() {
        return f71320g;
    }

    public static /* synthetic */ boolean c() {
        f71319f = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        f71319f = true;
        b();
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "startCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(1, this.f71326h, 20000L);
    }

    public final void a(f fVar) {
        if (!f71319f) {
            d();
        }
        this.f71321a.add(fVar);
        g gVar = g.a.f71361a;
        g.a(fVar);
    }

    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "stopCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(this.f71326h);
    }

    public final void b(final f fVar) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.a.f71361a;
                g.b(fVar);
            }
        });
    }
}
