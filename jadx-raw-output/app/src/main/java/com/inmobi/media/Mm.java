package com.inmobi.media;

import android.media.MediaPlayer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.inmobi.media.Mm;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import java.io.IOException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Mm {
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:15:0x0043->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:25:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(android.media.MediaPlayer r7, java.util.ArrayList r8, com.inmobi.media.C3053n9 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.Fm
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Fm r0 = (com.inmobi.media.Fm) r0
            int r1 = r0.f22686f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22686f = r1
            goto L18
        L13:
            com.inmobi.media.Fm r0 = new com.inmobi.media.Fm
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f22685e
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f22686f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.f22684d
            java.util.Iterator r8 = r0.f22683c
            com.inmobi.media.m9 r9 = r0.f22682b
            android.media.MediaPlayer r2 = r0.f22681a
            kotlin.c.b(r10)
            goto L88
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.c.b(r10)
            a(r7, r9)
            java.util.Iterator r8 = r8.iterator()
        L43:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r10)
            if (r2 == 0) goto L43
            if (r9 == 0) goto L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Video Loading for URL: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r4 = r9
            com.inmobi.media.n9 r4 = (com.inmobi.media.C3053n9) r4
            java.lang.String r5 = "VideoLoaderHelper"
            r4.a(r5, r2)
        L70:
            r7.reset()
            r0.f22681a = r7
            r0.f22682b = r9
            r0.f22683c = r8
            r0.f22684d = r10
            r0.f22686f = r3
            java.lang.Object r2 = a(r7, r10, r9, r0)
            if (r2 != r1) goto L84
            return r1
        L84:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L88:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            com.inmobi.media.Dm r8 = new com.inmobi.media.Dm
            r8.<init>(r7)
            return r8
        L96:
            r7 = r2
            goto L43
        L98:
            com.inmobi.media.zm r7 = com.inmobi.media.C3365zm.f25872a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mm.a(android.media.MediaPlayer, java.util.ArrayList, com.inmobi.media.n9, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void a(MediaPlayer mediaPlayer, final C3053n9 c3053n9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: b7.o3
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i10) {
                Mm.a(c3053n9, mediaPlayer2, i10);
            }
        });
    }

    public static final void a(InterfaceC3028m9 interfaceC3028m9, MediaPlayer mediaPlayer, int i10) {
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("VideoLoaderHelper", "Buffering Percentage: " + i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0154 -> B:58:0x015b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.media3.exoplayer.ExoPlayer r16, java.util.ArrayList r17, com.inmobi.media.InterfaceC3028m9 r18, com.inmobi.media.K2 r19, boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mm.a(androidx.media3.exoplayer.ExoPlayer, java.util.ArrayList, com.inmobi.media.m9, com.inmobi.media.K2, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object a(MediaPlayer mediaPlayer, String str, InterfaceC3028m9 interfaceC3028m9, Fm fm2) {
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(fm2), 1);
        cVar.J();
        cVar.p(new Hm(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new Im(interfaceC3028m9, str, cVar));
            mediaPlayer.setOnErrorListener(new Jm(interfaceC3028m9, str, cVar));
            InMobiVideoBridge.MediaPlayerSetDataSource(mediaPlayer, str);
            mediaPlayer.prepareAsync();
        } catch (IOException e10) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("VideoLoaderHelper", "Video Load Exception: " + e10.getMessage());
            }
            P4.a(cVar, tj.a.a(false));
        } catch (IllegalStateException e11) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("VideoLoaderHelper", "Video Load Exception: " + e11.getMessage());
            }
            P4.a(cVar, tj.a.a(false));
        }
        Object objB = cVar.B();
        if (objB == sj.a.f()) {
            tj.f.c(fm2);
        }
        return objB;
    }

    public static final Object a(ExoPlayer exoPlayer, String str, InterfaceC3028m9 interfaceC3028m9, K2 k10, boolean z10, Gm gm2) {
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(gm2), 1);
        cVar.J();
        Lm lm2 = new Lm(cVar, k10, str, interfaceC3028m9, exoPlayer);
        cVar.p(new Km(exoPlayer, lm2));
        if (interfaceC3028m9 != null) {
            try {
                ((C3053n9) interfaceC3028m9).a("VideoLoaderHelper", "Trying URL with cache " + z10 + ": " + str);
            } catch (Exception e10) {
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).b("VideoLoaderHelper", "Exception during media source preparation for URL (" + str + "): " + e10.getMessage());
                }
                exoPlayer.removeListener(lm2);
                if (cVar.isActive()) {
                    P4.a(cVar, new C2775c8(Am.UNKNOWN));
                }
                exoPlayer.stop();
                exoPlayer.clearMediaItems();
            }
        }
        MediaSource mediaSourceA = k10.a(str, z10);
        exoPlayer.addListener(lm2);
        exoPlayer.setMediaSource(mediaSourceA);
        exoPlayer.prepare();
        Object objB = cVar.B();
        if (objB == sj.a.f()) {
            tj.f.c(gm2);
        }
        return objB;
    }
}
