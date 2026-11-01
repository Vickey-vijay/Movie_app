package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Gm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExoPlayer f22755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3028m9 f22756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K2 f22757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f22758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f22763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22764j;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22763i = obj;
        this.f22764j |= Integer.MIN_VALUE;
        return Mm.a((ExoPlayer) null, (ArrayList) null, (InterfaceC3028m9) null, (K2) null, false, (ContinuationImpl) this);
    }

    public Gm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
