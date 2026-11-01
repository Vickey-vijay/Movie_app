package com.applovin.shadow.okio.internal;

import bk.p;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import kk.k;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import mj.r;
import nj.i;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
public final class FileSystem$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements p<k<? super Path>, c<? super r>, Object> {
    public final /* synthetic */ Path $fileOrDirectory;
    public final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, c<? super FileSystem$commonDeleteRecursively$sequence$1> cVar) {
        super(2, cVar);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, cVar);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(k<? super Path> kVar, c<? super r> cVar) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(kVar, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            k kVar = (k) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            i iVar = new i();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(kVar, fileSystem, iVar, path, false, true, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
