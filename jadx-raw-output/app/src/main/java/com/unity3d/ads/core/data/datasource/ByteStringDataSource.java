package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: ByteStringDataSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface ByteStringDataSource {
    Object get(c<? super ByteStringStoreOuterClass.ByteStringStore> cVar);

    Object set(ByteString byteString, c<? super r> cVar);
}
