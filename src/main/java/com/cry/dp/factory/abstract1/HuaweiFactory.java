package com.cry.dp.factory.abstract1;

public class HuaweiFactory implements ProductFactory {
    public PhoneProduct producePhoneProduct() {
        return new XiaomiPhone();
    }

    public RouterProduct produceRouterProduct() {
        return new XiaomiRouter();
    }
}
