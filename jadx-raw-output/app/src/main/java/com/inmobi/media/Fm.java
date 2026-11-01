package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Fm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f22681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3028m9 f22682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f22683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22686f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22685e = obj;
        this.f22686f |= Integer.MIN_VALUE;
        return Mm.a((MediaPlayer) null, (ArrayList) null, (C3053n9) null, this);
    }

    public Fm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
