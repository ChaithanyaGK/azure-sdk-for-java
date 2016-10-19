/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.fluentcore.arm.ResourceId;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class to test ResourceId class.
 */
public class ResourceIdTests {


    @Test
    public void ResourceIdForTopLevelResourceWorksFine() {
        ResourceId resourceId = ResourceId.parseResourceId("/subscriptions/9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef/resourceGroups/resourceGroupName/providers/Microsoft.Network/applicationGateways/something");
        Assert.assertEquals(resourceId.name(), "something");
        Assert.assertEquals(resourceId.subscriptionId(), "9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef");
        Assert.assertEquals(resourceId.resourceGroupName(), "resourceGroupName");
        Assert.assertNull(resourceId.parent());
    }

    @Test
    public void ResourceIdForChildLevelResourceWorksFine() {
        ResourceId resourceId = ResourceId.parseResourceId("/subscriptions/9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef/resourceGroups/resourceGroupName/providers/Microsoft.Network/applicationGateways/something/someChildType/childName");
        Assert.assertEquals(resourceId.name(), "childName");
        Assert.assertEquals(resourceId.subscriptionId(), "9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef");
        Assert.assertEquals(resourceId.resourceGroupName(), "resourceGroupName");
        Assert.assertNotNull(resourceId.parent());
        Assert.assertEquals(resourceId.parent().name(), "something");
        Assert.assertEquals(resourceId.parent().subscriptionId(), "9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef");
        Assert.assertEquals(resourceId.parent().resourceGroupName(), "resourceGroupName");
        Assert.assertEquals(resourceId.parent().name(), "something");
    }

    @Test
    public void ResourceIdForGrandChildLevelResourceWorksFine() {
        ResourceId resourceId = ResourceId.parseResourceId("/subscriptions/9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef/resourceGroups/resourceGroupName/providers/Microsoft.Network/applicationGateways/something/someChildType/childName/grandChildType/grandChild");

        Assert.assertEquals(resourceId.name(), "grandChild");
        Assert.assertEquals(resourceId.subscriptionId(), "9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef");
        Assert.assertEquals(resourceId.resourceGroupName(), "resourceGroupName");
        Assert.assertNotNull(resourceId.parent());
        Assert.assertEquals(resourceId.parent().name(), "childName");
        Assert.assertEquals(resourceId.parent().subscriptionId(), "9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef");
        Assert.assertEquals(resourceId.parent().resourceGroupName(), "resourceGroupName");
        Assert.assertNotNull(resourceId.parent().parent());
        Assert.assertEquals(resourceId.parent().parent().name(), "something");
        Assert.assertEquals(resourceId.parent().parent().subscriptionId(), "9657ab5d-4a4a-4fd2-ae7a-4cd9fbd030ef");
        Assert.assertEquals(resourceId.parent().parent().resourceGroupName(), "resourceGroupName");
        Assert.assertEquals(resourceId.parent().parent().name(), "something");
    }
}
