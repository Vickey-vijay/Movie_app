package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public final class EventBus {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile EventBus f34342o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34354k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ExecutorService f34341n = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f34343p = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f34344a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f34345b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f34346c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f34347d = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f34348e = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34349f = "onEvent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HandlerPoster f34350g = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final BackgroundPoster f34351h = new BackgroundPoster(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AsyncPoster f34352i = new AsyncPoster(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SubscriberMethodFinder f34353j = new SubscriberMethodFinder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f34355l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f34356m = new ConcurrentHashMap();

    public static final class BooleanWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34360a;
    }

    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z10) {
        Iterator<SubscriberMethod> it = this.f34353j.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z10);
        }
    }

    public void register(Object obj) {
        a(obj, this.f34349f, false);
    }

    public void registerSticky(Object obj) {
        a(obj, this.f34349f, true);
    }

    public Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.f34346c) {
            objRemove = this.f34346c.remove(cls);
        }
        return objRemove;
    }

    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            throw new IllegalArgumentException("Provide at least one event class");
        }
        List<Class<?>> list = this.f34345b.get(obj);
        if (list != null) {
            for (Class<?> cls : clsArr) {
                a(obj, cls);
                list.remove(cls);
            }
            if (list.isEmpty()) {
                this.f34345b.remove(obj);
            }
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34359a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f34359a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34359a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34359a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34359a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static EventBus getDefault() {
        if (f34342o == null) {
            synchronized (EventBus.class) {
                if (f34342o == null) {
                    f34342o = new EventBus();
                }
            }
        }
        return f34342o;
    }

    public void configureLogSubscriberExceptions(boolean z10) {
        if (this.f34354k) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.f34355l = z10;
    }

    public Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f34346c) {
            obj = this.f34346c.get(cls);
        }
        return obj;
    }

    public void post(Object obj) {
        List<Object> list = this.f34347d.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f34348e.get();
        if (booleanWrapper.f34360a) {
            return;
        }
        boolean z10 = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f34360a = true;
        while (!list.isEmpty()) {
            try {
                a(list.remove(0), z10);
            } catch (Throwable th2) {
                booleanWrapper.f34360a = false;
                throw th2;
            }
        }
        booleanWrapper.f34360a = false;
    }

    public void register(String str, Object obj) {
        Map<String, Object> map = this.f34356m;
        if (map != null && map.containsKey(str)) {
            unregister(this.f34356m.get(str));
        }
        this.f34356m.put(str, obj);
        a(obj, this.f34349f, false);
    }

    public void registerSticky(Object obj, String str) {
        a(obj, str, true);
    }

    public void release() {
        if (f34342o != null) {
            f34342o = null;
            f34341n = null;
            Map<Class<?>, List<Class<?>>> map = f34343p;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f34344a;
            if (map2 != null && map2.size() > 0) {
                this.f34344a.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f34345b;
            if (map3 != null && map3.size() > 0) {
                this.f34345b.clear();
            }
            Map<Class<?>, Object> map4 = this.f34346c;
            if (map4 != null && map4.size() > 0) {
                this.f34346c.clear();
            }
            Map<String, Object> map5 = this.f34356m;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.f34356m.clear();
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f34343p.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public void postSticky(Object obj) {
        post(obj);
        synchronized (this.f34346c) {
            this.f34346c.put(obj.getClass(), obj);
        }
    }

    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f34349f, true, cls, clsArr);
    }

    public synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.f34346c) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.f34346c.get(cls))) {
                return false;
            }
            this.f34346c.remove(cls);
            return true;
        }
    }

    private synchronized void a(Object obj, String str, boolean z10, Class<?> cls, Class<?>... clsArr) {
        for (SubscriberMethod subscriberMethod : this.f34353j.a(obj.getClass(), str)) {
            if (cls == subscriberMethod.f34373c) {
                a(obj, subscriberMethod, z10);
            } else if (clsArr != null) {
                for (Class<?> cls2 : clsArr) {
                    if (cls2 == subscriberMethod.f34373c) {
                        a(obj, subscriberMethod, z10);
                        break;
                    }
                }
            }
        }
    }

    public void register(Object obj, String str) {
        a(obj, str, false);
    }

    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f34349f, false, cls, clsArr);
    }

    public synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public synchronized void unregister(Object obj) {
        List<Class<?>> list = this.f34345b.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                a(obj, it.next());
            }
            this.f34345b.remove(obj);
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z10) {
        Object obj2;
        this.f34354k = true;
        Class<?> cls = subscriberMethod.f34373c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f34344a.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f34344a.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f34371a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.f34345b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f34345b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z10) {
            synchronized (this.f34346c) {
                obj2 = this.f34346c.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized void unregister(String str) {
        Map<String, Object> map = this.f34356m;
        if (map != null && map.containsKey(str)) {
            Object objRemove = this.f34356m.remove(str);
            List<Class<?>> list = this.f34345b.get(objRemove);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(objRemove, it.next());
                }
                this.f34345b.remove(objRemove);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + objRemove.getClass());
            }
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f34344a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                if (copyOnWriteArrayList.get(i10).f34377a == obj) {
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    private void a(Object obj, boolean z10) throws Error {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                List<Class<?>> listA = a(cls);
                int size = listA.size();
                boolean z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    Class<?> cls2 = listA.get(i10);
                    synchronized (this) {
                        copyOnWriteArrayList = this.f34344a.get(cls2);
                    }
                    if (copyOnWriteArrayList != null) {
                        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            a(it.next(), obj, z10);
                        }
                        z11 = true;
                    }
                }
                if (z11) {
                    return;
                }
                Log.d(TAG, "No subscripers registered for event " + cls);
                if (cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
                    return;
                }
                post(new NoSubscriberEvent(this, obj));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z10) {
        int i10 = AnonymousClass3.f34359a[subscription.f34378b.f34372b.ordinal()];
        if (i10 == 1) {
            a(subscription, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                a(subscription, obj);
                return;
            } else {
                this.f34350g.a(subscription, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f34351h.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f34352i.enqueue(subscription, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + subscription.f34378b.f34372b);
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f34343p;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    a(arrayList, superclass.getInterfaces());
                }
                f34343p.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public void a(PendingPost pendingPost) {
        Object obj = pendingPost.f34366a;
        Subscription subscription = pendingPost.f34367b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    public void a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f34378b.f34371a.invoke(subscription.f34377a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f34377a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f34355l) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f34377a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f34377a));
        }
    }
}
