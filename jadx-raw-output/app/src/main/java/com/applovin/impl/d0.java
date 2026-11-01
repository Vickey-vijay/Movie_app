package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public class d0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f7173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuffer f7174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f7175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f7176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f7177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f7178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f7179o;

    public class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7180a;

        public a(String str) {
            this.f7180a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f7103a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f7175k) {
                        StringUtils.replaceAll(d0.this.f7174j, this.f7180a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f7174j, this.f7180a, uri.toString());
                }
                d0.this.f7171g.a(uri.toString(), this.f7180a);
                return;
            }
            com.applovin.impl.sdk.o oVar = d0.this.f7105c;
            if (com.applovin.impl.sdk.o.a()) {
                d0 d0Var = d0.this;
                d0Var.f7105c.a(d0Var.f7104b, "Failed to cache JavaScript resource " + this.f7180a);
            }
            if (d0.this.f7173i != null) {
                d0.this.f7173i.a(d0.this.f7170f, true);
            }
        }
    }

    public class b implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f7184c;

        public b(String str, String str2, String str3) {
            this.f7182a = str;
            this.f7183b = str2;
            this.f7184c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f7103a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f7175k) {
                        StringUtils.replaceAll(d0.this.f7174j, this.f7182a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f7174j, this.f7182a, uri.toString());
                }
                d0.this.f7171g.a(uri.toString(), this.f7182a);
                return;
            }
            if (!d0.this.f7171g.Q().contains(this.f7183b + this.f7184c) || d0.this.f7173i == null) {
                return;
            }
            d0.this.f7173i.a(d0.this.f7170f, true);
        }
    }

    public interface c {
        void a(String str, boolean z10);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f7170f = str;
        this.f7171g = bVar;
        this.f7172h = list;
        this.f7176l = executorService;
        this.f7177m = str2;
        this.f7173i = cVar;
        this.f7174j = new StringBuffer(str);
        this.f7175k = new Object();
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f7176l.submit((e0) it.next()));
        }
        this.f7179o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        List listH = this.f7171g.H();
        Collection collectionF = f();
        for (String str : this.f7172h) {
            char c10 = 0;
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < this.f7170f.length()) {
                if (this.f7107e.get()) {
                    return null;
                }
                iIndexOf = this.f7170f.indexOf(str, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f7170f.length();
                int i11 = iIndexOf;
                while (!collectionF.contains(Character.valueOf(this.f7170f.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 <= iIndexOf || i11 == length) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7105c.b(this.f7104b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f7170f.substring(str.length() + iIndexOf, i11);
                String str2 = str + strSubstring;
                if (StringUtils.isValidString(strSubstring) && !listH.contains(str2)) {
                    com.applovin.impl.sdk.ad.b bVar = this.f7171g;
                    String[] strArr = new String[1];
                    strArr[c10] = str;
                    hashSet.add(new e0(str2, bVar, Arrays.asList(strArr), true, this.f7177m, this.f7103a, new b(str2, str, strSubstring)));
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f7105c.a(this.f7104b, "Skip caching of optional or non-resource " + strSubstring);
                }
                i10 = i11;
                c10 = 0;
            }
        }
        return hashSet;
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f7170f, (String) this.f7103a.a(x4.f9942h5)), 1)) {
            if (this.f7107e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f7171g, Collections.emptyList(), false, this.f7177m, this.f7103a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f7105c.a(this.f7104b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f7103a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f7107e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f7170f)) {
            a(this.f7170f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f7103a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7105c.a(this.f7104b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f7170f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f7103a.a(x4.f9933g5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f7178n = new ArrayList(hashSet);
        if (this.f7107e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f7178n;
        if (list == null || list.isEmpty()) {
            a(this.f7170f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7105c.a(this.f7104b, "Executing " + this.f7178n.size() + " caching operations...");
        }
        if (this.f7103a.q0().e()) {
            a(this.f7178n);
        } else {
            this.f7176l.invokeAll(this.f7178n);
        }
        if (((Boolean) this.f7103a.a(x4.T0)).booleanValue()) {
            synchronized (this.f7175k) {
                a(this.f7174j.toString());
            }
        } else {
            a(this.f7174j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f7178n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f7179o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.f7107e.get() || (cVar = this.f7173i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
