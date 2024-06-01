#include <gtest/gtest.h>

extern "C"
{
#include "stepper.h"
}

using namespace std;

TEST(SampleSuite, SampleTest) {
    ASSERT_EQ(42, 0);
}