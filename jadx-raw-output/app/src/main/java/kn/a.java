package kn;

import mn.g;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;

/* JADX INFO: compiled from: DeviceDescriptorBinder.java */
/* JADX INFO: loaded from: classes7.dex */
public interface a {
    <T extends un.a> T a(T t10, String str) throws ValidationException, DescriptorBindingException;

    String b(un.a aVar, vn.c cVar, g gVar) throws DescriptorBindingException;
}
