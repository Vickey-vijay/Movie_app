package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import bk.l;
import bk.p;
import ck.i;
import ck.s;
import cl.a;
import cl.d;
import cl.m;
import cl.x;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.logging.Severity;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import nk.w0;
import qk.e;
import rj.c;
import xk.h;

/* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
public class ViewPreCreationProfileRepository {
    private static final Companion Companion = new Companion(null);
    private static final WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = new WeakHashMap<>();
    private final Context context;
    private final ViewPreCreationProfile defaultProfile;

    /* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
    public static final class ViewPreCreationProfileSerializer implements Serializer<ViewPreCreationProfile> {
        private static final ViewPreCreationProfile defaultValue = null;
        public static final ViewPreCreationProfileSerializer INSTANCE = new ViewPreCreationProfileSerializer();
        private static final a json = m.b(null, new l<d, r>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(d dVar) {
                dVar.d(false);
            }
        }, 1, null);

        private ViewPreCreationProfileSerializer() {
        }

        @Override // androidx.datastore.core.Serializer
        public /* bridge */ /* synthetic */ Object writeTo(ViewPreCreationProfile viewPreCreationProfile, OutputStream outputStream, c cVar) {
            return writeTo2(viewPreCreationProfile, outputStream, (c<? super r>) cVar);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.datastore.core.Serializer
        public ViewPreCreationProfile getDefaultValue() {
            return defaultValue;
        }

        @Override // androidx.datastore.core.Serializer
        public Object readFrom(InputStream inputStream, c<? super ViewPreCreationProfile> cVar) {
            Object objM3458constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                a aVar2 = json;
                objM3458constructorimpl = Result.m3458constructorimpl((ViewPreCreationProfile) x.a(aVar2, h.b(aVar2.a(), s.g(ViewPreCreationProfile.class)), inputStream));
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thM3461exceptionOrNullimpl);
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                return null;
            }
            return objM3458constructorimpl;
        }

        /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
        public Object writeTo2(ViewPreCreationProfile viewPreCreationProfile, OutputStream outputStream, c<? super r> cVar) {
            Object objM3458constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                a aVar2 = json;
                x.b(aVar2, h.b(aVar2.a(), s.g(ViewPreCreationProfile.class)), viewPreCreationProfile, outputStream);
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thM3461exceptionOrNullimpl);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
    @tj.d(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {33}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super ViewPreCreationProfile>, Object> {
        public final /* synthetic */ String $id;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = ViewPreCreationProfileRepository.this.new AnonymousClass2(this.$id, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super ViewPreCreationProfile> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM3458constructorimpl;
            Object objR;
            Object objF = sj.a.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    ViewPreCreationProfileRepository viewPreCreationProfileRepository = ViewPreCreationProfileRepository.this;
                    String str = this.$id;
                    Result.a aVar = Result.Companion;
                    qk.c<ViewPreCreationProfile> data = ViewPreCreationProfileRepository.Companion.getStoreForId(viewPreCreationProfileRepository.context, str).getData();
                    this.label = 1;
                    objR = e.r(data, this);
                    if (objR == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    objR = obj;
                }
                objM3458constructorimpl = Result.m3458constructorimpl((ViewPreCreationProfile) objR);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thM3461exceptionOrNullimpl);
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) objM3458constructorimpl;
            if (viewPreCreationProfile != null) {
                return viewPreCreationProfile;
            }
            ViewPreCreationProfile viewPreCreationProfile2 = ViewPreCreationProfileRepository.this.defaultProfile;
            return viewPreCreationProfile2.copy((524286 & 1) != 0 ? viewPreCreationProfile2.f45843id : this.$id, (524286 & 2) != 0 ? viewPreCreationProfile2.text : null, (524286 & 4) != 0 ? viewPreCreationProfile2.image : null, (524286 & 8) != 0 ? viewPreCreationProfile2.gifImage : null, (524286 & 16) != 0 ? viewPreCreationProfile2.overlapContainer : null, (524286 & 32) != 0 ? viewPreCreationProfile2.linearContainer : null, (524286 & 64) != 0 ? viewPreCreationProfile2.wrapContainer : null, (524286 & 128) != 0 ? viewPreCreationProfile2.grid : null, (524286 & 256) != 0 ? viewPreCreationProfile2.gallery : null, (524286 & 512) != 0 ? viewPreCreationProfile2.pager : null, (524286 & 1024) != 0 ? viewPreCreationProfile2.tab : null, (524286 & 2048) != 0 ? viewPreCreationProfile2.state : null, (524286 & 4096) != 0 ? viewPreCreationProfile2.custom : null, (524286 & 8192) != 0 ? viewPreCreationProfile2.indicator : null, (524286 & 16384) != 0 ? viewPreCreationProfile2.slider : null, (524286 & 32768) != 0 ? viewPreCreationProfile2.input : null, (524286 & 65536) != 0 ? viewPreCreationProfile2.select : null, (524286 & 131072) != 0 ? viewPreCreationProfile2.video : null, (524286 & 262144) != 0 ? viewPreCreationProfile2.f3263switch : null);
        }
    }

    public Object get(String str, c<? super ViewPreCreationProfile> cVar) {
        return get$suspendImpl(this, str, cVar);
    }

    /* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final DataStore<ViewPreCreationProfile> getStoreForId(final Context context, final String str) {
            WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = getStores();
            DataStore<ViewPreCreationProfile> dataStoreCreate$default = stores.get(str);
            if (dataStoreCreate$default == null) {
                dataStoreCreate$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, ViewPreCreationProfileSerializer.INSTANCE, null, null, null, new bk.a<File>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$Companion$getStoreForId$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // bk.a
                    public final File invoke() {
                        File filesDir = context.getFilesDir();
                        String str2 = String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{str}, 1));
                        ck.p.i(str2, "format(...)");
                        return new File(filesDir, str2);
                    }
                }, 14, null);
                stores.put(str, dataStoreCreate$default);
            }
            return dataStoreCreate$default;
        }

        public final WeakHashMap<String, DataStore<ViewPreCreationProfile>> getStores() {
            return ViewPreCreationProfileRepository.stores;
        }
    }

    public ViewPreCreationProfileRepository(Context context, ViewPreCreationProfile viewPreCreationProfile) {
        this.context = context;
        this.defaultProfile = viewPreCreationProfile;
    }

    public static /* synthetic */ Object get$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, c<? super ViewPreCreationProfile> cVar) {
        return nk.h.g(w0.b(), viewPreCreationProfileRepository.new AnonymousClass2(str, null), cVar);
    }
}
