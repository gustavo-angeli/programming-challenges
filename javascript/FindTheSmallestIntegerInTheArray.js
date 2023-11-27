class SmallestIntegerFinder {
    findSmallestInt(args) {
        if (args.length === 0) {
            return undefined;
        }

        var minNumber = args[0];

        for (let index = 1; index < args.length; index++) {
            if (minNumber > args[index]) {
                minNumber = args[index];
            }
        }

        return minNumber;
    }
  }