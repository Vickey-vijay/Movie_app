package io.bidmachine.rendering.internal.repository;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import ck.p;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.model.Base64MediaSource;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.UrlMediaSource;
import io.bidmachine.rendering.utils.FileUtils;
import io.bidmachine.rendering.utils.NetworkRequest;
import io.bidmachine.util.ImageUtils;
import io.bidmachine.util.Utils;
import io.bidmachine.util.UtilsKt;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements io.bidmachine.rendering.internal.repository.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f60489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.h f60490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f60491c;

    public static final class a extends NetworkRequest.FileOutputStreamProcessor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BitmapFactory.Options f60492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, File file, BitmapFactory.Options options) {
            super(context, file);
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(file, C3426d4.i.f28530b);
            p.j(options, "options");
            this.f60492c = options;
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.FileOutputStreamProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap transform(File file) {
            p.j(file, C3426d4.i.f28530b);
            return ImageUtils.decodeFileToBitmapSafely(file, this.f60492c);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0534b implements NetworkRequest.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0 f60494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.rendering.internal.h f60495c;

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.b$b$a */
        public static final class a extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60496a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Error f60498c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Error error, rj.c cVar) {
                super(2, cVar);
                this.f60498c = error;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return AbstractC0534b.this.new a(this.f60498c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60496a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                AbstractC0534b.this.f60493a.onError(this.f60498c);
                return r.f64562a;
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.b$b$b, reason: collision with other inner class name */
        public static final class C0535b extends SuspendLambda implements bk.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60499a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f60501c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0535b(Object obj, rj.c cVar) {
                super(2, cVar);
                this.f60501c = obj;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c cVar) {
                return ((C0535b) create(l0Var, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c create(Object obj, rj.c cVar) {
                return AbstractC0534b.this.new C0535b(this.f60501c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f60499a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                AbstractC0534b.this.f60493a.onSuccess(this.f60501c);
                return r.f64562a;
            }
        }

        public AbstractC0534b(io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
            p.j(interfaceC0533a, "resultCallback");
            p.j(l0Var, "coroutineScope");
            p.j(hVar, "coroutineDispatchers");
            this.f60493a = interfaceC0533a;
            this.f60494b = l0Var;
            this.f60495c = hVar;
        }

        public abstract Error a();

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onError(Error error) {
            p.j(error, "error");
            nk.j.d(this.f60494b, this.f60495c.d(), null, new a(error, null), 2, null);
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onSuccess(Object obj) {
            if (obj != null) {
                nk.j.d(this.f60494b, this.f60495c.d(), null, new C0535b(obj, null), 2, null);
            } else {
                onError(a());
            }
        }
    }

    public static final class c extends NetworkRequest.FileOutputStreamProcessor {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, File file) {
            super(context, file);
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(file, C3426d4.i.f28530b);
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.FileOutputStreamProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri transform(File file) {
            p.j(file, C3426d4.i.f28530b);
            if (FileUtils.isEmpty(file)) {
                return null;
            }
            return FileUtils.toUri(file);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60502a;

        static {
            int[] iArr = new int[MediaSource.DeliveryType.values().length];
            try {
                iArr[MediaSource.DeliveryType.PRELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaSource.DeliveryType.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60502a = iArr;
        }
    }

    public static final class e extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Error f60505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, Error error, rj.c cVar) {
            super(2, cVar);
            this.f60504b = interfaceC0533a;
            this.f60505c = error;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return new e(this.f60504b, this.f60505c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60503a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f60504b.onError(this.f60505c);
            return r.f64562a;
        }
    }

    public static final class f extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f60508c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, Object obj, rj.c cVar) {
            super(2, cVar);
            this.f60507b = interfaceC0533a;
            this.f60508c = obj;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return new f(this.f60507b, this.f60508c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.f60506a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f60507b.onSuccess(this.f60508c);
            return r.f64562a;
        }
    }

    public static final class g extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60509a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediaSource f60511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60512d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
            super(2, cVar);
            this.f60511c = mediaSource;
            this.f60512d = interfaceC0533a;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return b.this.new g(this.f60511c, this.f60512d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f60509a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                b bVar = b.this;
                MediaSource mediaSource = this.f60511c;
                io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a = this.f60512d;
                this.f60509a = 1;
                if (bVar.a(mediaSource, interfaceC0533a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final class h extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaSource f60514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f60515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60516d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MediaSource mediaSource, b bVar, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
            super(2, cVar);
            this.f60514b = mediaSource;
            this.f60515c = bVar;
            this.f60516d = interfaceC0533a;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return new h(this.f60514b, this.f60515c, this.f60516d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f60513a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                BitmapFactory.Options optionsCreateDefaultBitmapFactoryOptions = ImageUtils.createDefaultBitmapFactoryOptions();
                optionsCreateDefaultBitmapFactoryOptions.inJustDecodeBounds = false;
                MediaSource mediaSource = this.f60514b;
                if (mediaSource instanceof UrlMediaSource) {
                    io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a = this.f60516d;
                    this.f60513a = 1;
                    if (this.f60515c.a((UrlMediaSource) mediaSource, optionsCreateDefaultBitmapFactoryOptions, interfaceC0533a, this) == objF) {
                        return objF;
                    }
                } else if (mediaSource instanceof Base64MediaSource) {
                    io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a2 = this.f60516d;
                    this.f60513a = 2;
                    if (this.f60515c.a((Base64MediaSource) mediaSource, optionsCreateDefaultBitmapFactoryOptions, interfaceC0533a2, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final class i extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60517a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediaSource f60519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60520d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
            super(2, cVar);
            this.f60519c = mediaSource;
            this.f60520d = interfaceC0533a;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((i) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return b.this.new i(this.f60519c, this.f60520d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f60517a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                b bVar = b.this;
                MediaSource mediaSource = this.f60519c;
                io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a = this.f60520d;
                this.f60517a = 1;
                if (bVar.b(mediaSource, interfaceC0533a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final class j extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaSource f60522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f60523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60524d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MediaSource mediaSource, b bVar, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
            super(2, cVar);
            this.f60522b = mediaSource;
            this.f60523c = bVar;
            this.f60524d = interfaceC0533a;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((j) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return new j(this.f60522b, this.f60523c, this.f60524d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f60521a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MediaSource mediaSource = this.f60522b;
                if (mediaSource instanceof UrlMediaSource) {
                    this.f60523c.a(((UrlMediaSource) mediaSource).getUrl(), new NetworkRequest.StringProcessor(), this.f60524d, new Error("Uri is null"));
                } else if (mediaSource instanceof Base64MediaSource) {
                    String strDecodeBase64ToString$default = Utils.decodeBase64ToString$default(((Base64MediaSource) mediaSource).getBase64(), 0, 2, (Object) null);
                    if (strDecodeBase64ToString$default != null) {
                        b bVar = this.f60523c;
                        io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a = this.f60524d;
                        this.f60521a = 1;
                        if (bVar.a(interfaceC0533a, strDecodeBase64ToString$default, this) == objF) {
                            return objF;
                        }
                    } else {
                        b bVar2 = this.f60523c;
                        io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a2 = this.f60524d;
                        Error error = new Error("Can't decode string from base64");
                        this.f60521a = 2;
                        if (bVar2.a(interfaceC0533a2, error, (rj.c) this) == objF) {
                            return objF;
                        }
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final class k extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60525a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediaSource f60527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60528d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
            super(2, cVar);
            this.f60527c = mediaSource;
            this.f60528d = interfaceC0533a;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((k) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return b.this.new k(this.f60527c, this.f60528d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f60525a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                b bVar = b.this;
                MediaSource mediaSource = this.f60527c;
                io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a = this.f60528d;
                this.f60525a = 1;
                if (bVar.c(mediaSource, interfaceC0533a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final class l extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaSource f60530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f60531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MediaSource mediaSource, b bVar, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
            super(2, cVar);
            this.f60530b = mediaSource;
            this.f60531c = bVar;
            this.f60532d = interfaceC0533a;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((l) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return new l(this.f60530b, this.f60531c, this.f60532d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f60529a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MediaSource mediaSource = this.f60530b;
                if (mediaSource instanceof UrlMediaSource) {
                    io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a = this.f60532d;
                    this.f60529a = 1;
                    if (this.f60531c.a((UrlMediaSource) mediaSource, interfaceC0533a, (rj.c) this) == objF) {
                        return objF;
                    }
                } else {
                    this.f60532d.onError(new Error("Unsupported media source type: " + this.f60530b));
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final class m extends SuspendLambda implements bk.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60533a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f60535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.repository.a.InterfaceC0533a f60536d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
            super(2, cVar);
            this.f60535c = str;
            this.f60536d = interfaceC0533a;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c cVar) {
            return ((m) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c create(Object obj, rj.c cVar) {
            return b.this.new m(this.f60535c, this.f60536d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f60533a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Uri uriB = b.this.b(this.f60535c);
                if (uriB != null) {
                    b bVar = b.this;
                    io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a = this.f60536d;
                    this.f60533a = 1;
                    if (bVar.a(interfaceC0533a, uriB, this) == objF) {
                        return objF;
                    }
                } else {
                    b bVar2 = b.this;
                    io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a2 = this.f60536d;
                    Error error = new Error("Can't parse video stream url - " + this.f60535c);
                    this.f60533a = 2;
                    if (bVar2.a(interfaceC0533a2, error, (rj.c) this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final class n extends AbstractC0534b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Error f60537d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, Error error, l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
            super(interfaceC0533a, l0Var, hVar);
            this.f60537d = error;
        }

        @Override // io.bidmachine.rendering.internal.repository.b.AbstractC0534b
        public Error a() {
            return this.f60537d;
        }
    }

    public b(Context context, l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(l0Var, "coroutineScope");
        p.j(hVar, "coroutineDispatchers");
        this.f60489a = l0Var;
        this.f60490b = hVar;
        this.f60491c = context.getApplicationContext();
    }

    @Override // io.bidmachine.rendering.internal.repository.a
    public void b(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a) {
        p.j(mediaSource, "mediaSource");
        p.j(interfaceC0533a, "resultCallback");
        nk.j.d(this.f60489a, null, null, new g(mediaSource, interfaceC0533a, null), 3, null);
    }

    @Override // io.bidmachine.rendering.internal.repository.a
    public void c(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a) {
        p.j(mediaSource, "mediaSource");
        p.j(interfaceC0533a, "resultCallback");
        nk.j.d(this.f60489a, null, null, new k(mediaSource, interfaceC0533a, null), 3, null);
    }

    public final Object b(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        Object objG = nk.h.g(this.f60490b.c(), new j(mediaSource, this, interfaceC0533a, null), cVar);
        return objG == sj.a.f() ? objG : r.f64562a;
    }

    public final Object c(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        Object objG = nk.h.g(this.f60490b.c(), new l(mediaSource, this, interfaceC0533a, null), cVar);
        return objG == sj.a.f() ? objG : r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, Error error, rj.c cVar) {
        Object objG = nk.h.g(this.f60490b.d(), new e(interfaceC0533a, error, null), cVar);
        return objG == sj.a.f() ? objG : r.f64562a;
    }

    public final Uri b(String str) {
        p.j(str, "url");
        try {
            return Utils.getValidUri(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, Object obj, rj.c cVar) {
        Object objG = nk.h.g(this.f60490b.d(), new f(interfaceC0533a, obj, null), cVar);
        return objG == sj.a.f() ? objG : r.f64562a;
    }

    public final Object b(String str, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        Object objG = nk.h.g(this.f60490b.c(), new m(str, interfaceC0533a, null), cVar);
        return objG == sj.a.f() ? objG : r.f64562a;
    }

    public final NetworkRequest.FileOutputStreamProcessor a(Context context, File file, BitmapFactory.Options options) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(file, C3426d4.i.f28530b);
        p.j(options, "options");
        return new a(context, file, options);
    }

    public final Object a(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        Object objG = nk.h.g(this.f60490b.c(), new h(mediaSource, this, interfaceC0533a, null), cVar);
        return objG == sj.a.f() ? objG : r.f64562a;
    }

    public final Bitmap a(String str, BitmapFactory.Options options) {
        p.j(str, "base64");
        p.j(options, "options");
        byte[] bArrDecodeBase64$default = UtilsKt.decodeBase64$default(str, 0, 1, (Object) null);
        if (bArrDecodeBase64$default != null) {
            return ImageUtils.decodeBytesToBitmapSafely(bArrDecodeBase64$default, options);
        }
        return null;
    }

    public final Object a(Base64MediaSource base64MediaSource, BitmapFactory.Options options, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        Bitmap bitmapA = a(base64MediaSource.getBase64(), options);
        if (bitmapA != null) {
            Object objA = a(interfaceC0533a, bitmapA, cVar);
            return objA == sj.a.f() ? objA : r.f64562a;
        }
        Object objA2 = a(interfaceC0533a, new Error("Can't decode image from base64"), cVar);
        return objA2 == sj.a.f() ? objA2 : r.f64562a;
    }

    public final Object a(UrlMediaSource urlMediaSource, BitmapFactory.Options options, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        String url = urlMediaSource.getUrl();
        File fileA = a(url);
        if (fileA == null) {
            Object objA = a(interfaceC0533a, new Error("Can't create file for image by url (" + url + ')'), cVar);
            return objA == sj.a.f() ? objA : r.f64562a;
        }
        Context context = this.f60491c;
        p.i(context, "applicationContext");
        NetworkRequest.FileOutputStreamProcessor fileOutputStreamProcessorA = a(context, fileA, options);
        Bitmap bitmap = (Bitmap) fileOutputStreamProcessorA.transform(fileA);
        if (bitmap != null) {
            Object objA2 = a(interfaceC0533a, bitmap, cVar);
            return objA2 == sj.a.f() ? objA2 : r.f64562a;
        }
        a(url, fileOutputStreamProcessorA, interfaceC0533a, new Error("Failed to load image from url (" + url + ')'));
        return r.f64562a;
    }

    public final File a(String str) {
        p.j(str, "url");
        return FileUtils.getFileByUrl(this.f60491c, str);
    }

    @Override // io.bidmachine.rendering.internal.repository.a
    public void a(MediaSource mediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a) {
        p.j(mediaSource, "mediaSource");
        p.j(interfaceC0533a, "resultCallback");
        nk.j.d(this.f60489a, null, null, new i(mediaSource, interfaceC0533a, null), 3, null);
    }

    public final NetworkRequest.FileOutputStreamProcessor a(Context context, File file) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(file, C3426d4.i.f28530b);
        return new c(context, file);
    }

    public final Object a(String str, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        File fileA = a(str);
        if (fileA == null) {
            Object objA = a(interfaceC0533a, new Error("Can't create file for video by url (" + str + ')'), cVar);
            return objA == sj.a.f() ? objA : r.f64562a;
        }
        Context context = this.f60491c;
        p.i(context, "applicationContext");
        NetworkRequest.FileOutputStreamProcessor fileOutputStreamProcessorA = a(context, fileA);
        Uri uri = (Uri) fileOutputStreamProcessorA.transform(fileA);
        if (uri != null) {
            Object objA2 = a(interfaceC0533a, uri, cVar);
            return objA2 == sj.a.f() ? objA2 : r.f64562a;
        }
        a(str, fileOutputStreamProcessorA, interfaceC0533a, new Error("Uri is null"));
        return r.f64562a;
    }

    public final Object a(UrlMediaSource urlMediaSource, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, rj.c cVar) {
        Object objB;
        String url = urlMediaSource.getUrl();
        int i10 = d.f60502a[urlMediaSource.getDeliveryType().ordinal()];
        if (i10 != 1) {
            return (i10 == 2 && (objB = b(url, interfaceC0533a, cVar)) == sj.a.f()) ? objB : r.f64562a;
        }
        Object objA = a(url, interfaceC0533a, cVar);
        return objA == sj.a.f() ? objA : r.f64562a;
    }

    public final void a(String str, NetworkRequest.ResponseProcessor responseProcessor, io.bidmachine.rendering.internal.repository.a.InterfaceC0533a interfaceC0533a, Error error) {
        p.j(str, "url");
        p.j(responseProcessor, "processor");
        p.j(interfaceC0533a, "resultCallback");
        p.j(error, "error");
        new NetworkRequest.Builder(str, NetworkRequest.Method.Get).setResponseTransformer(responseProcessor).setListener(new n(interfaceC0533a, error, this.f60489a, this.f60490b)).send();
    }
}
