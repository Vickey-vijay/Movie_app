package yads;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class sx1 extends i {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient y43 f82825h;

    public sx1(Map map, ox1 ox1Var) {
        super(map);
        this.f82825h = (y43) ng2.a(ox1Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f82825h = (y43) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f75344f = map;
        this.f75345g = 0;
        for (Collection collection : map.values()) {
            if (!collection.isEmpty()) {
                this.f75345g = collection.size() + this.f75345g;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f82825h);
        objectOutputStream.writeObject(this.f75344f);
    }
}
