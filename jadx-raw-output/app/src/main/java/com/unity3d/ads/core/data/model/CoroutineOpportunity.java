package com.unity3d.ads.core.data.model;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import kotlin.coroutines.d;

/* JADX INFO: compiled from: CoroutineOpportunity.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CoroutineOpportunity implements d.b {
    public static final Key Key = new Key(null);
    private final ByteString value;

    /* JADX INFO: compiled from: CoroutineOpportunity.kt */
    public static final class Key implements d.c<CoroutineOpportunity> {
        private Key() {
        }

        public /* synthetic */ Key(i iVar) {
            this();
        }
    }

    @Override // kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return Key;
    }

    public final ByteString getValue() {
        return this.value;
    }

    public CoroutineOpportunity(ByteString byteString) {
        p.j(byteString, "value");
        this.value = byteString;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, bk.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.b.a.d(this, dVar);
    }
}
