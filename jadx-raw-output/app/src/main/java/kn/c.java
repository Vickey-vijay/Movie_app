package kn;

import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import un.l;

/* JADX INFO: compiled from: ServiceDescriptorBinder.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c {
    String a(l lVar) throws DescriptorBindingException;

    <T extends l> T b(T t10, String str) throws ValidationException, DescriptorBindingException;
}
