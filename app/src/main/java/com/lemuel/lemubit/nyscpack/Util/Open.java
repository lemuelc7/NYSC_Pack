/*
Copyright 2018 OGBUNUDE CHIBUEZE LEMUEL

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.lemuel.lemubit.nyscpack.Util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

//Class with methon 'OpenActivity which is to help reduce boilerplate code when opening new activity
public class Open {
    public static void OpenActivity(Context context, Class<?> cls, Bundle bundle) {

        Intent intent = new Intent(context, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
    }
}