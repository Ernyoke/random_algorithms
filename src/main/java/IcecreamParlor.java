import java.util.*;

public class IcecreamParlor {
    public static class IceCream {
        private String name;
        private int price;

        public IceCream(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IceCream iceCream = (IceCream) o;

            if (price != iceCream.price) return false;
            return Objects.equals(name, iceCream.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + price;
            return result;
        }

        @Override
        public String toString() {
            return "IceCream{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static List<List<IceCream>> solve(List<IceCream> iceCreams, int totalAmount) {
        Map<Integer, IceCream> iceCreamMap = new HashMap<>();
        List<List<IceCream>> result = new ArrayList<>();
        Set<IceCream> touched = new HashSet<>();
        for (IceCream iceCream : iceCreams) {
            iceCreamMap.put(iceCream.getPrice(), iceCream);
        }
        for (IceCream iceCream : iceCreams) {
            touched.add(iceCream);
            int remainingAmount = totalAmount - iceCream.getPrice();
            if (remainingAmount > 0) {
                IceCream other = iceCreamMap.get(remainingAmount);
                if (other != null && !touched.contains(other)) {
                    result.add(Arrays.asList(iceCream, other));
                }
            }
        }
        return result;
    }
}
