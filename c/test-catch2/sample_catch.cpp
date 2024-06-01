#include "ApprovalTests.hpp"
#include "catch2/catch.hpp"

extern "C"
{
#include "stepper.h"
}


TEST_CASE ("Sample") {
    SECTION("sample section") {
        REQUIRE(42 == 0);
    }
}


