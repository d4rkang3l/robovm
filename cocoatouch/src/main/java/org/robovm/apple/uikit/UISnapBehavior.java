/*
 * Copyright (C) 2014 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISnapBehavior/*</name>*/ 
    extends /*<extends>*/UIDynamicBehavior/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UISnapBehaviorPtr extends Ptr<UISnapBehavior, UISnapBehaviorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISnapBehavior.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISnapBehavior() {}
    protected UISnapBehavior(SkipInit skipInit) { super(skipInit); }
    public UISnapBehavior(UIDynamicItem item, @ByVal CGPoint point) { super((SkipInit) null); initObject(initWithItem$snapToPoint$(item, point)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "damping")
    public native @MachineSizedFloat double getDamping();
    @Property(selector = "setDamping:")
    public native void setDamping(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItem:snapToPoint:")
    protected native @Pointer long initWithItem$snapToPoint$(UIDynamicItem item, @ByVal CGPoint point);
    /*</methods>*/
}
