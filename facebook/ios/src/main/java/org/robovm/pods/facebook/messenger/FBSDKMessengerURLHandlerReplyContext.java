/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.pods.facebook.messenger;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKMessengerURLHandlerReplyContext/*</name>*/ 
    extends /*<extends>*/FBSDKMessengerContext/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKMessengerURLHandlerReplyContextPtr extends Ptr<FBSDKMessengerURLHandlerReplyContext, FBSDKMessengerURLHandlerReplyContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKMessengerURLHandlerReplyContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKMessengerURLHandlerReplyContext() {}
    protected FBSDKMessengerURLHandlerReplyContext(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "metadata")
    public native String getMetadata();
    @Property(selector = "userIDs")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getUserIDs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
