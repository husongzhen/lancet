package me.ele.lancet.weaver;

import java.util.List;

/**
 * Created by gengwanpeng on 17/3/21.
 */
public interface Weaver{


    ClassData[] weave(byte[] input);
}
