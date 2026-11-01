package za;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: StreamUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static boolean b(OutputStream outputStream, Object obj) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(outputStream);
                try {
                    objectOutputStream2.writeObject(obj);
                    objectOutputStream2.flush();
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    objectOutputStream = objectOutputStream2;
                    e.printStackTrace();
                    if (objectOutputStream == null) {
                        return false;
                    }
                    try {
                        objectOutputStream.close();
                        return false;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static <D> List<D> a(InputStream inputStream, Class<D> cls) throws Throwable {
        System.out.println("...... className : " + cls.getSimpleName() + " ......");
        ArrayList arrayList = new ArrayList();
        ObjectInputStream objectInputStream = null;
        try {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(inputStream);
                try {
                    for (Object obj : (ArrayList) objectInputStream2.readObject()) {
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                    }
                    try {
                        objectInputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    return arrayList;
                } catch (Exception e11) {
                    e = e11;
                    objectInputStream = objectInputStream2;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }
}
