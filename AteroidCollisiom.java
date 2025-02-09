//package Grind75;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class AteroidCollisiom {
//    public int[] asteroidCollision(int[] asteroids) {
//        Stack<Integer> first = new Stack<>();
//
//        for (int i = asteroids.length - 1; i >= 0; i--) {
//            first.push(asteroids[i]);
//        }
//
//
//        ArrayList<Integer> list = new ArrayList<>();
////        while (!first.isEmpty()){
////            int num = first.pop();
////
////            if (num!=first.peek()){
//////                second.push(Math.max(Math.abs(num),Math.abs(first.peek())));
////                list.add(Math.max(Math.abs(num),Math.abs(first.peek())));
////            }
////
////        }
////        return list.toArray(new int[]);
//
//        while (!first.isEmpty()) {
//            int num = first.pop();
//
//            // If the current asteroid is positive or the list is empty, simply add it
//            if (list.isEmpty() || num > 0) {
//                list.add(num);
//            } else {
//                // Process the asteroid collision
//                while (!list.isEmpty() && list.get(list.size() - 1) > 0 && list.get(list.size() - 1) < Math.abs(num)) {
//                    list.remove(list.size() - 1);
//                }
//                // If the last asteroid in the list is moving left or destroyed, add the current asteroid
//                if (list.isEmpty() || list.get(list.size() - 1) < 0) {
//                    list.add(num);
//                } else if (list.get(list.size() - 1) == -num) {
//                    // If they are the same size but opposite direction, destroy both
//                    list.remove(list.size() - 1);
//                }
//            }
//
//            int[] result = new int[list.size()];
//            for (int i = 0; i < list.size(); i++) {
//                result[i] = list.get(i);
//            }
//
//            return result;
//        }
//    }
//}
