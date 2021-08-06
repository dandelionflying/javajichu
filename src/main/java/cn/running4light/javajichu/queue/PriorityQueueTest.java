package cn.running4light.javajichu.queue;

import java.util.PriorityQueue;

/**
 * @author running4light
 * @description 优先队列
 * @createTime 2021/8/6 15:02
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(11);
//        必须是同一类型的
//        priorityQueue.add("ss");
//        priorityQueue.add(1.2);
        priorityQueue.add(22);
        priorityQueue.add(33);

        System.err.println(priorityQueue.poll());
        System.err.println(priorityQueue.poll());
        System.err.println(priorityQueue.poll());
        System.err.println(priorityQueue.poll());

    }
}
