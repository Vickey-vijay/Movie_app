package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import bk.a;
import bk.p;
import bk.q;
import ck.i;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.g;
import mj.r;
import nj.b0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00010B\u008c\u0001\b\u0002\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0'\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)\u0012$\b\u0002\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014\u0012(\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b+\u0010,Bz\b\u0017\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)\u0012$\b\u0002\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014\u0012(\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019ø\u0001\u0000¢\u0006\u0004\b+\u0010-B|\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)\u0012$\b\u0002\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014\u0012(\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019ø\u0001\u0000¢\u0006\u0004\b+\u0010/J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R3\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R9\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00198\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", "T", "Landroidx/datastore/core/DataMigration;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "name", "Lmj/r;", "deleteSharedPreferences", "Ljava/io/File;", "getSharedPrefsFile", "prefsFile", "getSharedPrefsBackup", "currentData", "", "shouldMigrate", "(Ljava/lang/Object;Lrj/c;)Ljava/lang/Object;", "migrate", "cleanUp", "(Lrj/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lrj/c;", "", "shouldRunMigration", "Lbk/p;", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "Lbk/q;", "Landroid/content/Context;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lmj/g;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "keySet", "Ljava/util/Set;", "Lkotlin/Function0;", "produceSharedPreferences", "", "keysToMigrate", "<init>", "(Lbk/a;Ljava/util/Set;Lbk/p;Lbk/q;Landroid/content/Context;Ljava/lang/String;)V", "(Lbk/a;Ljava/util/Set;Lbk/p;Lbk/q;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lbk/p;Lbk/q;)V", "Api24Impl", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final q<SharedPreferencesView, T, c<? super T>, Object> migrate;
    private final String name;

    /* JADX INFO: renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
    private final g sharedPrefs;
    private final p<T, c<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @RequiresApi(24)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$Api24Impl;", "", "()V", "deleteSharedPreferences", "", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "name", "", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final boolean deleteSharedPreferences(Context context, String name) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @d(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", l = {147}, m = "shouldMigrate")
    public static final class C08311 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08311(SharedPreferencesMigration<T> sharedPreferencesMigration, c<? super C08311> cVar) {
            super(cVar);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, q<? super SharedPreferencesView, ? super T, ? super c<? super T>, ? extends Object> qVar) {
        this(context, str, null, null, qVar, 12, null);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "sharedPreferencesName");
        ck.p.j(qVar, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, q<? super SharedPreferencesView, ? super T, ? super c<? super T>, ? extends Object> qVar) {
        this(context, str, set, null, qVar, 8, null);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "sharedPreferencesName");
        ck.p.j(set, "keysToMigrate");
        ck.p.j(qVar, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(a<? extends SharedPreferences> aVar, q<? super SharedPreferencesView, ? super T, ? super c<? super T>, ? extends Object> qVar) {
        this(aVar, (Set) null, (p) null, qVar, 6, (i) null);
        ck.p.j(aVar, "produceSharedPreferences");
        ck.p.j(qVar, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super c<? super Boolean>, ? extends Object> pVar, q<? super SharedPreferencesView, ? super T, ? super c<? super T>, ? extends Object> qVar, Context context, String str) {
        this.shouldRunMigration = pVar;
        this.migrate = qVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs = b.a(aVar);
        this.keySet = set == SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() ? null : b0.S0(set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(a<? extends SharedPreferences> aVar, Set<String> set, q<? super SharedPreferencesView, ? super T, ? super c<? super T>, ? extends Object> qVar) {
        this(aVar, set, (p) null, qVar, 4, (i) null);
        ck.p.j(aVar, "produceSharedPreferences");
        ck.p.j(set, "keysToMigrate");
        ck.p.j(qVar, "migrate");
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @d(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, c<? super Boolean>, Object> {
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(T t10, c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(t10, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                return tj.a.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @d(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, c<? super Boolean>, Object> {
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(T t10, c<? super Boolean> cVar) {
            return ((AnonymousClass2) create(t10, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                return tj.a.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @d(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<T, c<? super Boolean>, Object> {
        public int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(T t10, c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(t10, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                return tj.a.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    private final File getSharedPrefsBackup(File prefsFile) {
        return new File(ck.p.s(prefsFile.getPath(), ".bak"));
    }

    private final File getSharedPrefsFile(Context context, String name) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), ck.p.s(name, ".xml"));
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t10, c<? super T> cVar) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t10, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    public Object shouldMigrate(T t10, c<? super Boolean> cVar) throws Throwable {
        C08311 c08311;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (cVar instanceof C08311) {
            c08311 = (C08311) cVar;
            int i10 = c08311.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08311.label = i10 - Integer.MIN_VALUE;
            } else {
                c08311 = new C08311(this, cVar);
            }
        } else {
            c08311 = new C08311(this, cVar);
        }
        Object objMo1invoke = c08311.result;
        Object objF = sj.a.f();
        int i11 = c08311.label;
        boolean z10 = true;
        if (i11 == 0) {
            kotlin.c.b(objMo1invoke);
            p<T, c<? super Boolean>, Object> pVar = this.shouldRunMigration;
            c08311.L$0 = this;
            c08311.label = 1;
            objMo1invoke = pVar.mo1invoke(t10, c08311);
            if (objMo1invoke == objF) {
                return objF;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = (SharedPreferencesMigration) c08311.L$0;
            kotlin.c.b(objMo1invoke);
        }
        if (!((Boolean) objMo1invoke).booleanValue()) {
            return tj.a.a(false);
        }
        Set<String> set = sharedPreferencesMigration.keySet;
        if (set == null) {
            Map<String, ?> all = sharedPreferencesMigration.getSharedPrefs().getAll();
            ck.p.i(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            SharedPreferences sharedPrefs = sharedPreferencesMigration.getSharedPrefs();
            if ((set instanceof Collection) && set.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (tj.a.a(sharedPrefs.contains((String) it.next())).booleanValue()) {
                    }
                }
                z10 = false;
            }
        }
        return tj.a.a(z10);
    }

    private final void deleteSharedPreferences(Context context, String str) throws IOException {
        if (Api24Impl.deleteSharedPreferences(context, str)) {
        } else {
            throw new IOException(ck.p.s("Unable to delete SharedPreferences: ", str));
        }
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(c<? super r> cVar) throws IOException {
        r rVar;
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (editorEdit.commit()) {
            if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
                deleteSharedPreferences(context, str);
            }
            Set<String> set2 = this.keySet;
            if (set2 == null) {
                rVar = null;
            } else {
                set2.clear();
                rVar = r.f64562a;
            }
            if (rVar == sj.a.f()) {
                return rVar;
            }
            return r.f64562a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    public /* synthetic */ SharedPreferencesMigration(a aVar, Set set, p pVar, q qVar, Context context, String str, int i10, i iVar) {
        this((a<? extends SharedPreferences>) aVar, (Set<String>) set, (i10 & 4) != 0 ? new AnonymousClass1(null) : pVar, qVar, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(a aVar, Set set, p pVar, q qVar, int i10, i iVar) {
        this((a<? extends SharedPreferences>) aVar, (Set<String>) ((i10 & 2) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set), (i10 & 4) != 0 ? new AnonymousClass2(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super c<? super Boolean>, ? extends Object> pVar, q<? super SharedPreferencesView, ? super T, ? super c<? super T>, ? extends Object> qVar) {
        this(aVar, set, pVar, qVar, (Context) null, (String) null);
        ck.p.j(aVar, "produceSharedPreferences");
        ck.p.j(set, "keysToMigrate");
        ck.p.j(pVar, "shouldRunMigration");
        ck.p.j(qVar, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, p pVar, q qVar, int i10, i iVar) {
        this(context, str, (i10 & 4) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set, (i10 & 8) != 0 ? new AnonymousClass3(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(final Context context, final String str, Set<String> set, p<? super T, ? super c<? super Boolean>, ? extends Object> pVar, q<? super SharedPreferencesView, ? super T, ? super c<? super T>, ? extends Object> qVar) {
        this(new a<SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final SharedPreferences invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                ck.p.i(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        }, set, pVar, qVar, context, str);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "sharedPreferencesName");
        ck.p.j(set, "keysToMigrate");
        ck.p.j(pVar, "shouldRunMigration");
        ck.p.j(qVar, "migrate");
    }
}
