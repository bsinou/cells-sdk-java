package com.pydio.sdk.sync.tree;

import java.util.List;

import com.pydio.sdk.core.model.BasicTreeNodeInfo;
import com.pydio.sdk.core.model.TreeNodeInfo;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Wraps a TreeMap to simply store the full tree in memory. Children are
 * computed based on the passed path.
 */
public class MemoryStateManagerTest {

    private StateManager manager;

    @Before
    public void setup() {
        manager = new MemoryStateManager();
    }

    @Test
    public void testBasicCrud() {
        manager.put("common-ws/", new BasicTreeNodeInfo("eTag", "common-ws/", false, 0));
        TreeNodeInfo rootInfo = manager.get("common-ws/");
        Assert.assertEquals(rootInfo.getName(), "/");
        Assert.assertEquals(rootInfo.getPath(), "common-ws/");
        Assert.assertEquals(rootInfo.getETag(), "eTag");
        Assert.assertEquals(rootInfo.isLeaf(), false);
    }

    @Test
    public void testGetChildren() {
        manager.put("common-ws/", new BasicTreeNodeInfo("eTag", "common-ws/", false, 0));
        manager.put("common-ws/parent", new BasicTreeNodeInfo("eTag", "common-ws/parent", false, 0));
        manager.put("common-ws/parent/child", new BasicTreeNodeInfo("eTag2", "common-ws/parent/child", false, 0));
        manager.put("common-ws/parent/child/node.txt", new BasicTreeNodeInfo("eTag2", "common-ws/parent/child/node.txt", false, 0));
        manager.put("common-ws/parent/child/greatchild", new BasicTreeNodeInfo("eTag3", "common-ws/parent/child/greatchild", false, 0));
        manager.put("common-ws/parent/childother", new BasicTreeNodeInfo("eTag4", "common-ws/parent/childother", false, 0));
        manager.put("common-ws/parent/child2", new BasicTreeNodeInfo("eTag5", "common-ws/parent/child2", false, 0));
        manager.put("common-ws/parent/child3", new BasicTreeNodeInfo("eTag6", "common-ws/parent/child3", false, 0));

        TreeNodeInfo nodeInfo = manager.get("common-ws/parent/child");
        Assert.assertEquals(nodeInfo.getName(), "child");
        Assert.assertEquals(nodeInfo.getPath(), "common-ws/parent/child");
        Assert.assertEquals(nodeInfo.getETag(), "eTag2");
        Assert.assertEquals(nodeInfo.isLeaf(), false);

        List<TreeNodeInfo> children = manager.getChildren("common-ws/parent");
        Assert.assertTrue(children.size() >= 1);
        Assert.assertEquals(children.size(), 4);

    }

    @After
    public void teardown() {
        manager = null;
    }

}

// browse :
// compare => different
// update ETag state manager
// update Children manager
// add change create ("/parent")

// check children

// compare => different
// update state manager
// add change create ("/parent/child")

// check children children
// crash

// add change create ("/parent/child/node.txt")

// return (changes)
