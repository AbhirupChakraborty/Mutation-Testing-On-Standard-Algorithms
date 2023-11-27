package Graph;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CourseScheduleTest {
    @Test
    public void testFindOrder() {

        // Test case 1: Valid course schedule
        int n1 = 4;
        int[][] prerequisites1 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] expected1 = {0, 1, 2, 3};
        assertArrayEquals(expected1, CourseSchedule.findOrder(n1, prerequisites1));

        // Test case 2: Circular dependency, should return an empty array
        int n2 = 4;
        int[][] prerequisites2 = {{1, 0}, {2, 1}, {3, 2}, {0, 3}};
        int[] expected2 = {};
        assertArrayEquals(expected2, CourseSchedule.findOrder(n2, prerequisites2));

        // Test case 3: Valid course schedule with a single course
        int n3 = 1;
        int[][] prerequisites3 = {};
        int[] expected3 = {0};
        assertArrayEquals(expected3, CourseSchedule.findOrder(n3, prerequisites3));

        // Test case 4: Empty prerequisites, all courses can be taken in any order
        int n4 = 3;
        int[][] prerequisites4 = {};
        int[] expected4 = {0, 1, 2};
        assertArrayEquals(expected4, CourseSchedule.findOrder(n4, prerequisites4));
    }
}
